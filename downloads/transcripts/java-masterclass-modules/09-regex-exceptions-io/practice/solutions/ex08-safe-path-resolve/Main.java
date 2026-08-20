import java.nio.file.*;

public class Main {
    public static Path safeResolve(Path root, String userPart) {
        Path base = root.toAbsolutePath().normalize();
        Path candidate = base.resolve(userPart).normalize();
        if (!candidate.startsWith(base)) {
            throw new IllegalArgumentException("path escapes root");
        }
        return candidate;
    }

    public static void main(String[] args) {
        System.out.println(safeResolve(Path.of("data"), "logs/app.txt"));
    }
}

