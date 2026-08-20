import java.nio.file.*;
public class SelfCheck {
    static void check(boolean ok, String message) { if (!ok) throw new AssertionError(message); }
    public static void main(String[] args) throws Exception {
        Path dir = Files.createTempDirectory("ex17-");
        Path file = dir.resolve("snapshot.bin");
        Main.Snapshot value = new Main.Snapshot("java", 17);
        Main.write(file, value);
        Main.Snapshot copy = Main.read(file);
        check(copy.name().equals("java") && copy.score() == 17, "round trip");
        check(copy.cache().equals("JAVA"), "rebuild transient");
        Files.walk(dir).sorted(java.util.Comparator.reverseOrder()).forEach(path -> {
            try { Files.deleteIfExists(path); } catch (Exception ex) { throw new RuntimeException(ex); }
        });
        System.out.println("PASS");
    }
}

