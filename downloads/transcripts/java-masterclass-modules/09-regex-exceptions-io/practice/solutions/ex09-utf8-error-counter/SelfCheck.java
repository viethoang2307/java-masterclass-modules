import java.nio.charset.*;
import java.nio.file.*;
public class SelfCheck {
    static void check(boolean ok, String message) { if (!ok) throw new AssertionError(message); }
    public static void main(String[] args) throws Exception {
        Path dir = Files.createTempDirectory("ex09-");
        Path file = dir.resolve("app.log");
        Files.writeString(file, "INFO ok\nERROR bad\nERROR worse\n", StandardCharsets.UTF_8);
        check(Main.countErrors(file) == 2, "count");
        Files.walk(dir).sorted(java.util.Comparator.reverseOrder()).forEach(path -> {
            try { Files.deleteIfExists(path); } catch (Exception ex) { throw new RuntimeException(ex); }
        });
        System.out.println("PASS");
    }
}

