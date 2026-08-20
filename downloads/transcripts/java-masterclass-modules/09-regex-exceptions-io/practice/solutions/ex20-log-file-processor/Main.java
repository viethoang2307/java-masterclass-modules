import java.io.*;
import java.nio.charset.*;
import java.nio.file.*;
import java.util.*;
import java.util.regex.*;
import java.util.stream.*;

public class Main {
    public record Report(Map<String, Long> counts, long malformed) {}
    private static final Pattern LOG =
        Pattern.compile("^(?<level>INFO|WARN|ERROR)\\s+.*$");

    public static Report process(Path path) throws IOException {
        Map<String, Long> counts = new LinkedHashMap<>();
        long malformed = 0;
        try (Stream<String> lines = Files.lines(path, StandardCharsets.UTF_8)) {
            for (String line : (Iterable<String>) lines::iterator) {
                Matcher matcher = LOG.matcher(line);
                if (!matcher.matches()) { malformed++; continue; }
                String level = matcher.group("level");
                counts.merge(level, 1L, Long::sum);
            }
        }
        return new Report(Map.copyOf(counts), malformed);
    }

    public static void main(String[] args) throws IOException {
        System.out.println(process(Path.of("app.log")));
    }
}


