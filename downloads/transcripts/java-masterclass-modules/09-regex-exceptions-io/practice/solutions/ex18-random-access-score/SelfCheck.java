import java.nio.file.*;
public class SelfCheck {
    static void check(boolean ok, String message) { if (!ok) throw new AssertionError(message); }
    public static void main(String[] args) throws Exception {
        Path dir = Files.createTempDirectory("ex18-");
        Path file = dir.resolve("scores.bin");
        Main.writeScore(file, 0, 10);
        Main.writeScore(file, 2, 30);
        check(Main.readScore(file, 0) == 10, "first");
        check(Main.readScore(file, 2) == 30, "seek");
        boolean failed = false;
        try { Main.readScore(file, 3); } catch (java.io.EOFException ex) { failed = true; }
        check(failed, "bounds");
        Files.walk(dir).sorted(java.util.Comparator.reverseOrder()).forEach(path -> {
            try { Files.deleteIfExists(path); } catch (Exception ex) { throw new RuntimeException(ex); }
        });
        System.out.println("PASS");
    }
}

