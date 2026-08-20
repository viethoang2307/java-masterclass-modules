import java.util.ArrayList;
import java.util.List;
import java.util.Map;
import java.util.TreeMap;
import java.util.concurrent.ConcurrentHashMap;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;
import java.util.concurrent.Future;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class Main {
    private static final Pattern LOG = Pattern.compile("^(INFO|WARN|ERROR)\\s+.*$");

    public static Map<String, Integer> process(List<String> lines) throws Exception {
        ConcurrentHashMap<String, Integer> counts = new ConcurrentHashMap<>();
        ExecutorService pool = Executors.newFixedThreadPool(4);
        try {
            List<Future<?>> futures = new ArrayList<>();
            for (String line : lines) {
                futures.add(pool.submit(() -> {
                    Matcher matcher = LOG.matcher(line);
                    if (matcher.matches()) counts.merge(matcher.group(1), 1, Integer::sum);
                }));
            }
            for (Future<?> future : futures) future.get();
            return new TreeMap<>(counts);
        } finally {
            pool.shutdownNow();
        }
    }
}
