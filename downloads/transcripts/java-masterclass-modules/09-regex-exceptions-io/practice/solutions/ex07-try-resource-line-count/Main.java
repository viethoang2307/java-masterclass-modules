import java.io.*;
import java.nio.charset.*;
import java.nio.file.*;
import java.util.stream.*;

public class Main {
    public static long countLines(Path path) throws IOException {
        try (Stream<String> lines = Files.lines(path, StandardCharsets.UTF_8)) {
            return lines.count();
        }
    }

    public static void main(String[] args) throws IOException {
        System.out.println(countLines(Path.of("input.txt")));
    }
}

