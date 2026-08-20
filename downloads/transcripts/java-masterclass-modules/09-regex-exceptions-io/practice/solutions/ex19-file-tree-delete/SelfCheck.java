import java.nio.file.*;
public class SelfCheck {
    static void check(boolean ok, String message) { if (!ok) throw new AssertionError(message); }
    public static void main(String[] args) throws Exception {
        Path root = Files.createTempDirectory("ex19-");
        Files.createDirectories(root.resolve("nested"));
        Files.writeString(root.resolve("a.txt"), "a");
        Files.writeString(root.resolve("nested/b.txt"), "b");
        Main.deleteTree(root);
        check(!Files.exists(root), "deleted");
        Main.deleteTree(root);
        System.out.println("PASS");
    }
}

