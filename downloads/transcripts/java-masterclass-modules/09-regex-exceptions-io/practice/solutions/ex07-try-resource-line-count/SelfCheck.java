import java.nio.charset.*;
import java.nio.file.*;
public class SelfCheck {
    static void check(boolean ok, String message) { if (!ok) throw new AssertionError(message); }
    public static void main(String[] args) throws Exception {
        Path dir = Files.createTempDirectory("ex07-");
        Path file = dir.resolve("input.txt");
        Files.writeString(file, "a\nb\nc", StandardCharsets.UTF_8);
        check(Main.countLines(file) == 3, "lines");
        Files.walk(dir).sorted(java.util.Comparator.reverseOrder()).forEach(path -> {
            try { Files.deleteIfExists(path); } catch (Exception ex) { throw new RuntimeException(ex); }
        });
        System.out.println("PASS");
    }
}

