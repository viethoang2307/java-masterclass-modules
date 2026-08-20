import java.nio.file.*;
public class SelfCheck {
    static void check(boolean ok, String message) { if (!ok) throw new AssertionError(message); }
    public static void main(String[] args) throws Exception {
        Path dir = Files.createTempDirectory("ex15-");
        Path file = dir.resolve("header.bin");
        Main.Header expected = new Main.Header(1, "Việt");
        Main.write(file, expected);
        check(Main.read(file).equals(expected), "round trip");
        Files.write(file, new byte[]{1});
        boolean failed = false;
        try { Main.read(file); } catch (java.io.EOFException ex) { failed = true; }
        check(failed, "truncated");
        Files.walk(dir).sorted(java.util.Comparator.reverseOrder()).forEach(path -> {
            try { Files.deleteIfExists(path); } catch (Exception ex) { throw new RuntimeException(ex); }
        });
        System.out.println("PASS");
    }
}

