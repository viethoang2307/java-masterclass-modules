import java.io.*;
import java.nio.charset.*;
import java.nio.file.*;

public class Main {
    public static long countErrors(Path path) throws IOException {
        try (var lines = Files.lines(path, StandardCharsets.UTF_8)) {
            return lines.filter(line -> line.startsWith("ERROR")).count();
        }
    }

    public static void main(String[] args) throws IOException {
        System.out.println(countErrors(Path.of("app.log")));
    }
}

