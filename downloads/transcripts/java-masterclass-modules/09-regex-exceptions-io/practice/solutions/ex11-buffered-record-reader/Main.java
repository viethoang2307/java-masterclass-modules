import java.io.*;
import java.nio.charset.*;
import java.nio.file.*;
import java.util.*;

public class Main {
    public record RecordLine(int number, String text) {}

    public static List<RecordLine> read(Path path) throws IOException {
        List<RecordLine> result = new ArrayList<>();
        try (BufferedReader reader = Files.newBufferedReader(path, StandardCharsets.UTF_8)) {
            String line;
            int number = 1;
            while ((line = reader.readLine()) != null) {
                result.add(new RecordLine(number++, line));
            }
        }
        return List.copyOf(result);
    }

    public static void main(String[] args) throws IOException {
        System.out.println(read(Path.of("input.txt")));
    }
}

