import java.nio.file.*;
import java.util.*;
public class SelfCheck {
    static void check(boolean ok, String message) { if (!ok) throw new AssertionError(message); }
    public static void main(String[] args) throws Exception {
        Path dir = Files.createTempDirectory("ex16-");
        Path source = dir.resolve("a.bin"), target = dir.resolve("b.bin");
        byte[] bytes = new byte[]{0, 1, 2, (byte)255, 4};
        Files.write(source, bytes);
        check(Main.copy(source, target) == bytes.length, "count");
        check(Arrays.equals(Files.readAllBytes(target), bytes), "bytes");
        boolean failed = false;
        try { Main.copy(source, source); } catch (IllegalArgumentException ex) { failed = true; }
        check(failed, "same file");
        Files.walk(dir).sorted(Comparator.reverseOrder()).forEach(path -> {
            try { Files.deleteIfExists(path); } catch (Exception ex) { throw new RuntimeException(ex); }
        });
        System.out.println("PASS");
    }
}

