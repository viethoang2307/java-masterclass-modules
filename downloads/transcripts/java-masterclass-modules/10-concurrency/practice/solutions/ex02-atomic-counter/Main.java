import java.util.concurrent.atomic.AtomicInteger;

public class Main {
    public static int count(int threads, int increments) throws InterruptedException {
        AtomicInteger counter = new AtomicInteger();
        Thread[] workers = new Thread[threads];
        for (int i = 0; i < threads; i++) {
            workers[i] = new Thread(() -> {
                for (int j = 0; j < increments; j++) counter.incrementAndGet();
            }, "counter-" + i);
            workers[i].start();
        }
        for (Thread worker : workers) worker.join();
        return counter.get();
    }
}
