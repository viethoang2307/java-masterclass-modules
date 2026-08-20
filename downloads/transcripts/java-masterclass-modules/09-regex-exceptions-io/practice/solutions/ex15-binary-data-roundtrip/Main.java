import java.io.*;
import java.nio.file.*;

public class Main {
    public record Header(int version, String name) {}

    public static void write(Path path, Header header) throws IOException {
        try (DataOutputStream out = new DataOutputStream(Files.newOutputStream(path))) {
            out.writeInt(header.version());
            out.writeUTF(header.name());
        }
    }

    public static Header read(Path path) throws IOException {
        try (DataInputStream in = new DataInputStream(Files.newInputStream(path))) {
            return new Header(in.readInt(), in.readUTF());
        }
    }

    public static void main(String[] args) throws IOException {
        write(Path.of("header.bin"), new Header(1, "java"));
    }
}

