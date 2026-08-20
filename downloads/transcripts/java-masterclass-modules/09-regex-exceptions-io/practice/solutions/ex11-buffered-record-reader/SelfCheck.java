import java.nio.charset.*;
import java.nio.file.*;
public class SelfCheck {
    static void check(boolean ok, String message) { if (!ok) throw new AssertionError(message); }
    public static void main(String[] args) throws Exception {
        Path dir = Files.createTempDirectory("ex11-");
        Path file = dir.resolve("input.txt");
        Files.writeString(file, "a\nb\n", StandardCharsets.UTF_8);
        var result = Main.read(file);
        check(result.size() == 2 && result.get(1).number() == 2, "records");
        check(result.get(1).text().equals("b"), "text");
        Files.walk(dir).sorted(java.util.Comparator.reverseOrder()).forEach(path -> {
            try { Files.deleteIfExists(path); } catch (Exception ex) { throw new RuntimeException(ex); }
        });
        System.out.println("PASS");
    }
}

