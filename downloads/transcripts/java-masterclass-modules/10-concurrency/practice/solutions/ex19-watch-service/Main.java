import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.StandardWatchEventKinds;
import java.nio.file.WatchEvent;
import java.nio.file.WatchKey;
import java.nio.file.WatchService;
import java.util.concurrent.TimeUnit;

public class Main {
    public static boolean detects() throws Exception {
        Path directory = Files.createTempDirectory("module10-watch-");
        try (WatchService watcher = directory.getFileSystem().newWatchService()) {
            directory.register(watcher, StandardWatchEventKinds.ENTRY_CREATE);
            Thread producer = new Thread(() -> {
                try { Files.writeString(directory.resolve("ready.txt"), "ok"); }
                catch (IOException e) { throw new RuntimeException(e); }
            });
            producer.start();
            WatchKey key = watcher.poll(1, TimeUnit.SECONDS);
            boolean found = false;
            if (key != null) {
                for (WatchEvent<?> event : key.pollEvents()) {
                    if (event.kind() == StandardWatchEventKinds.ENTRY_CREATE
                            && "ready.txt".equals(event.context().toString())) found = true;
                }
                key.reset();
            }
            producer.join(500);
            return found && !producer.isAlive();
        } finally {
            Files.deleteIfExists(directory.resolve("ready.txt"));
            Files.deleteIfExists(directory);
        }
    }
}
