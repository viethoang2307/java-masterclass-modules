import java.io.*;
import java.nio.charset.*;
import java.nio.file.*;

public class Main {
    public static void writeAtomic(Path target, String content) throws IOException {
        Path parent = target.toAbsolutePath().getParent();
        Files.createDirectories(parent);
        Path temp = Files.createTempFile(parent, ".write-", ".tmp");
        try {
            Files.writeString(temp, content, StandardCharsets.UTF_8,
                StandardOpenOption.TRUNCATE_EXISTING);
            try {
                Files.move(temp, target, StandardCopyOption.ATOMIC_MOVE,
                    StandardCopyOption.REPLACE_EXISTING);
            } catch (AtomicMoveNotSupportedException ex) {
                Files.move(temp, target, StandardCopyOption.REPLACE_EXISTING);
            }
        } finally {
            Files.deleteIfExists(temp);
        }
    }

    public static void main(String[] args) throws IOException {
        writeAtomic(Path.of("report.txt"), "done");
    }
}

