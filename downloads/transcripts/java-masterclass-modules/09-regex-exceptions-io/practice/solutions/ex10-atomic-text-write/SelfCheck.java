import java.nio.charset.*;
import java.nio.file.*;
public class SelfCheck {
    static void check(boolean ok, String message) { if (!ok) throw new AssertionError(message); }
    public static void main(String[] args) throws Exception {
        Path dir = Files.createTempDirectory("ex10-");
        Path target = dir.resolve("report.txt");
        Main.writeAtomic(target, "first");
        check(Files.readString(target, StandardCharsets.UTF_8).equals("first"), "write");
        Main.writeAtomic(target, "second");
        check(Files.readString(target, StandardCharsets.UTF_8).equals("second"), "replace");
        Files.walk(dir).sorted(java.util.Comparator.reverseOrder()).forEach(path -> {
            try { Files.deleteIfExists(path); } catch (Exception ex) { throw new RuntimeException(ex); }
        });
        System.out.println("PASS");
    }
}

