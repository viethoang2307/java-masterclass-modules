import java.util.concurrent.ForkJoinPool;
import java.util.concurrent.RecursiveTask;

public class Main {
    private static final class SumTask extends RecursiveTask<Long> {
        private final int[] values;
        private final int from;
        private final int to;
        SumTask(int[] values, int from, int to) { this.values = values; this.from = from; this.to = to; }
        protected Long compute() {
            if (to - from <= 1_000) {
                long total = 0;
                for (int i = from; i < to; i++) total += values[i];
                return total;
            }
            int mid = (from + to) / 2;
            SumTask left = new SumTask(values, from, mid);
            SumTask right = new SumTask(values, mid, to);
            left.fork();
            long rightValue = right.compute();
            return left.join() + rightValue;
        }
    }

    public static long sum(int[] values) {
        ForkJoinPool pool = new ForkJoinPool(4);
        try { return pool.invoke(new SumTask(values, 0, values.length)); }
        finally { pool.shutdown(); }
    }
}
