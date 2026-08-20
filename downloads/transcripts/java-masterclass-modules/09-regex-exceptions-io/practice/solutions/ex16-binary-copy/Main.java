import java.io.*;
import java.nio.file.*;

public class Main {
    public static long copy(Path source, Path target) throws IOException {
        if (source.toAbsolutePath().normalize().equals(target.toAbsolutePath().normalize()))
            throw new IllegalArgumentException("same file");
        long total = 0;
        byte[] buffer = new byte[8192];
        try (InputStream in = Files.newInputStream(source);
             OutputStream out = Files.newOutputStream(target)) {
            int read;
            while ((read = in.read(buffer)) != -1) {
                out.write(buffer, 0, read);
                total += read;
            }
        }
        return total;
    }

    public static void main(String[] args) throws IOException {
        System.out.println(copy(Path.of("a.bin"), Path.of("b.bin")));
    }
}

