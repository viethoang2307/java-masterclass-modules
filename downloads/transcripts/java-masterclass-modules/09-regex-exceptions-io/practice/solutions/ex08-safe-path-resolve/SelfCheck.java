import java.nio.file.*;
public class SelfCheck {
    static void check(boolean ok, String message) { if (!ok) throw new AssertionError(message); }
    public static void main(String[] args) {
        Path root = Path.of("data");
        check(Main.safeResolve(root, "logs/app.txt").endsWith(Path.of("data", "logs", "app.txt")), "inside");
        boolean failed = false;
        try { Main.safeResolve(root, "../secret.txt"); } catch (IllegalArgumentException ex) { failed = true; }
        check(failed, "escape");
        System.out.println("PASS");
    }
}

