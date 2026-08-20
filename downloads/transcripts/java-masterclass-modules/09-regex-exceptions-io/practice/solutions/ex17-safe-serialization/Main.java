import java.io.*;
import java.nio.file.*;

public class Main {
    public static final class Snapshot implements Serializable {
        private static final long serialVersionUID = 1L;
        private final String name;
        private final int score;
        private transient String cache;
        public Snapshot(String name, int score) {
            if (name == null || name.isBlank() || score < 0) throw new IllegalArgumentException();
            this.name = name; this.score = score; this.cache = name.toUpperCase();
        }
        public String name() { return name; }
        public int score() { return score; }
        public String cache() { return cache; }
        private void readObject(ObjectInputStream in) throws IOException, ClassNotFoundException {
            in.defaultReadObject();
            if (name == null || name.isBlank() || score < 0) throw new InvalidObjectException("invalid");
            cache = name.toUpperCase();
        }
    }

    public static void write(Path path, Snapshot value) throws IOException {
        try (ObjectOutputStream out = new ObjectOutputStream(Files.newOutputStream(path))) { out.writeObject(value); }
    }
    public static Snapshot read(Path path) throws IOException, ClassNotFoundException {
        try (ObjectInputStream in = new ObjectInputStream(Files.newInputStream(path))) { return (Snapshot) in.readObject(); }
    }

    public static void main(String[] args) throws Exception {
        write(Path.of("snapshot.bin"), new Snapshot("java", 17));
    }
}

