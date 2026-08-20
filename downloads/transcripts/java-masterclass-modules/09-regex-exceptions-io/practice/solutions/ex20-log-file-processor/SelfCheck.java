import java.nio.charset.*;
import java.nio.file.*;
public class SelfCheck {
    static void check(boolean ok, String message) { if (!ok) throw new AssertionError(message); }
    public static void main(String[] args) throws Exception {
        Path dir = Files.createTempDirectory("ex20-");
        Path file = dir.resolve("app.log");
        Files.writeString(file, "INFO start\nbad line\nERROR fail\nINFO done\n", StandardCharsets.UTF_8);
        Main.Report report = Main.process(file);
        check(report.counts().get("INFO") == 2L, "info");
        check(report.counts().get("ERROR") == 1L, "error");
        check(report.malformed() == 1L, "malformed");
        Files.walk(dir).sorted(java.util.Comparator.reverseOrder()).forEach(path -> {
            try { Files.deleteIfExists(path); } catch (Exception ex) { throw new RuntimeException(ex); }
        });
        System.out.println("PASS");
    }
}

