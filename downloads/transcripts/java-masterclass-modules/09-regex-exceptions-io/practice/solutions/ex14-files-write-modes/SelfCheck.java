import java.nio.charset.*;
import java.nio.file.*;
public class SelfCheck {
    static void check(boolean ok, String message) { if (!ok) throw new AssertionError(message); }
    public static void main(String[] args) throws Exception {
        Path dir = Files.createTempDirectory("ex14-");
        Path file = dir.resolve("out.txt");
        Main.write(file, "a", Main.Mode.CREATE_NEW);
        Main.write(file, "b", Main.Mode.APPEND);
        check(Files.readString(file).equals("ab"), "append");
        Main.write(file, "c", Main.Mode.REPLACE);
        check(Files.readString(file).equals("c"), "replace");
        boolean failed = false;
        try { Main.write(file, "x", Main.Mode.CREATE_NEW); } catch (FileAlreadyExistsException ex) { failed = true; }
        check(failed, "create new");
        Files.walk(dir).sorted(java.util.Comparator.reverseOrder()).forEach(path -> {
            try { Files.deleteIfExists(path); } catch (Exception ex) { throw new RuntimeException(ex); }
        });
        System.out.println("PASS");
    }
}

