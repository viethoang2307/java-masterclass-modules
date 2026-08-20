import java.util.concurrent.CompletableFuture;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;

public class Main {
    public static String combine() throws Exception {
        ExecutorService pool = Executors.newFixedThreadPool(3);
        try {
            CompletableFuture<String> a = CompletableFuture.supplyAsync(() -> "A", pool);
            CompletableFuture<String> b = CompletableFuture.supplyAsync(() -> "B", pool);
            CompletableFuture<String> c = CompletableFuture.supplyAsync(() -> "C", pool);
            return a.thenCombine(b, (left, right) -> left + "+" + right)
                    .thenCombine(c, (left, right) -> left + "+" + right).join();
        } finally {
            pool.shutdownNow();
        }
    }
}
