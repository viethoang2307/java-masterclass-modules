public class Main {
    public static long sum(int[] values, int workers) throws InterruptedException {
        if (workers <= 0) throw new IllegalArgumentException("workers");
        int count = Math.min(workers, Math.max(1, values.length));
        long[] partial = new long[count];
        Thread[] threads = new Thread[count];
        for (int i = 0; i < count; i++) {
            final int slot = i;
            int from = values.length * i / count;
            int to = values.length * (i + 1) / count;
            threads[i] = new Thread(() -> {
                long total = 0;
                for (int j = from; j < to; j++) total += values[j];
                partial[slot] = total;
            }, "sum-" + i);
            threads[i].start();
        }
        long result = 0;
        for (Thread thread : threads) thread.join();
        for (long part : partial) result += part;
        return result;
    }
}
