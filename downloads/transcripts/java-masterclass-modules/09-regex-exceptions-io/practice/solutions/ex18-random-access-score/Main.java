import java.io.*;
import java.nio.file.*;

public class Main {
    private static final int RECORD_BYTES = Integer.BYTES;

    public static void writeScore(Path path, int index, int score) throws IOException {
        if (index < 0) throw new IllegalArgumentException("index");
        try (RandomAccessFile file = new RandomAccessFile(path.toFile(), "rw")) {
            file.seek((long) index * RECORD_BYTES);
            file.writeInt(score);
        }
    }

    public static int readScore(Path path, int index) throws IOException {
        if (index < 0) throw new IllegalArgumentException("index");
        try (RandomAccessFile file = new RandomAccessFile(path.toFile(), "r")) {
            long offset = (long) index * RECORD_BYTES;
            if (offset + RECORD_BYTES > file.length()) throw new EOFException("record");
            file.seek(offset);
            return file.readInt();
        }
    }

    public static void main(String[] args) throws IOException {
        writeScore(Path.of("scores.bin"), 2, 99);
    }
}

