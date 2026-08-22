import java.util.List;
import java.util.Map;

public class Main {
    record Track(String artist, int seconds) {}

    static Map<String, Long> countByArtist(List<Track> tracks) {
        // TODO: create a deterministic count report, ignoring null tracks and blank artists.
        return Map.of();
    }
}
