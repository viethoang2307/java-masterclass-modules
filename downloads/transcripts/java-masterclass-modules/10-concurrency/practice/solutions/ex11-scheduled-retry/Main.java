import java.util.concurrent.CountDownLatch;
import java.util.concurrent.ScheduledExecutorService;
import java.util.concurrent.ScheduledFuture;
import java.util.concurrent.Executors;
import java.util.concurrent.TimeUnit;
import java.util.concurrent.atomic.AtomicInteger;

public class Main {
    public static int attempts() throws InterruptedException {
        ScheduledExecutorService scheduler = Executors.newSingleThreadScheduledExecutor();
        AtomicInteger count = new AtomicInteger();
        CountDownLatch success = new CountDownLatch(1);
        final ScheduledFuture<?>[] holder = new ScheduledFuture<?>[1];
        holder[0] = scheduler.scheduleWithFixedDelay(() -> {
            if (count.incrementAndGet() >= 3) {
                success.countDown();
                holder[0].cancel(false);
            }
        }, 0, 1, TimeUnit.MILLISECONDS);
        try {
            if (!success.await(500, TimeUnit.MILLISECONDS)) throw new AssertionError("retry timeout");
            return count.get();
        } finally {
            holder[0].cancel(true);
            scheduler.shutdownNow();
            scheduler.awaitTermination(500, TimeUnit.MILLISECONDS);
        }
    }
}
