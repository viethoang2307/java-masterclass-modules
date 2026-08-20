import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.concurrent.ConcurrentHashMap;

public class Main {
    public static Map<String, Integer> frequencies(List<String> words) throws InterruptedException {
        ConcurrentHashMap<String, Integer> counts = new ConcurrentHashMap<>();
        int workers = Math.min(4, Math.max(1, words.size()));
        List<Thread> threads = new ArrayList<>();
        for (int i = 0; i < workers; i++) {
            int from = words.size() * i / workers;
            int to = words.size() * (i + 1) / workers;
            Thread thread = new Thread(() -> {
                for (int j = from; j < to; j++) counts.merge(words.get(j), 1, Integer::sum);
            });
            threads.add(thread);
            thread.start();
        }
        for (Thread thread : threads) thread.join();
        return new HashMap<>(counts);
    }
}
