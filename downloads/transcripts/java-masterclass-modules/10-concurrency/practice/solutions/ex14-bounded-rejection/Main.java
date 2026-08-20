import java.util.concurrent.ArrayBlockingQueue;
import java.util.concurrent.CountDownLatch;
import java.util.concurrent.RejectedExecutionException;
import java.util.concurrent.ThreadPoolExecutor;
import java.util.concurrent.TimeUnit;

public class Main {
    public static int rejections() throws InterruptedException {
        CountDownLatch started = new CountDownLatch(1);
        CountDownLatch release = new CountDownLatch(1);
        ThreadPoolExecutor pool = new ThreadPoolExecutor(1, 1, 0, TimeUnit.MILLISECONDS,
                new ArrayBlockingQueue<>(1), new ThreadPoolExecutor.AbortPolicy());
        int rejected = 0;
        try {
            pool.execute(() -> { started.countDown(); try { release.await(); } catch (InterruptedException e) { Thread.currentThread().interrupt(); } });
            if (!started.await(500, TimeUnit.MILLISECONDS)) throw new AssertionError("worker not started");
            pool.execute(() -> { });
            try { pool.execute(() -> { }); } catch (RejectedExecutionException expected) { rejected++; }
            return rejected;
        } finally {
            release.countDown();
            pool.shutdownNow();
            pool.awaitTermination(500, TimeUnit.MILLISECONDS);
        }
    }
}
