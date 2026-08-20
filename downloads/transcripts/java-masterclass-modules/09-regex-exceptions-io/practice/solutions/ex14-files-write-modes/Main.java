import java.io.*;
import java.nio.charset.*;
import java.nio.file.*;
import java.util.*;

public class Main {
    public enum Mode { CREATE_NEW, REPLACE, APPEND }

    public static void write(Path path, String text, Mode mode) throws IOException {
        switch (mode) {
            case CREATE_NEW -> Files.writeString(path, text, UTF_8,
                StandardOpenOption.CREATE_NEW, StandardOpenOption.WRITE);
            case REPLACE -> Files.writeString(path, text, UTF_8,
                StandardOpenOption.CREATE, StandardOpenOption.TRUNCATE_EXISTING, StandardOpenOption.WRITE);
            case APPEND -> Files.writeString(path, text, UTF_8,
                StandardOpenOption.CREATE, StandardOpenOption.APPEND, StandardOpenOption.WRITE);
        }
    }

    private static final Charset UTF_8 = StandardCharsets.UTF_8;

    public static void main(String[] args) throws IOException {
        write(Path.of("out.txt"), "data", Mode.REPLACE);
    }
}

