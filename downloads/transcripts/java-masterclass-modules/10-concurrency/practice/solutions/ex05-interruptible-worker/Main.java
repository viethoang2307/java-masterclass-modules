import java.util.concurrent.CountDownLatch;
import java.util.concurrent.atomic.AtomicBoolean;

public class Main {
    public static boolean wasInterrupted() throws InterruptedException {
        CountDownLatch gate = new CountDownLatch(1);
        AtomicBoolean observed = new AtomicBoolean();
        Thread worker = new Thread(() -> {
            try {
                gate.await();
            } catch (InterruptedException e) {
                observed.set(true);
                Thread.currentThread().interrupt();
            }
        }, "interruptible");
        worker.start();
        worker.interrupt();
        worker.join(500);
        return observed.get() && !worker.isAlive();
    }
}
