import java.util.List;
import java.util.Map;
import java.util.TreeMap;
import java.util.stream.Collectors;

public class Main {
    record Track(String artist, int seconds) {}

    static Map<String, Long> countByArtist(List<Track> tracks) {
        if (tracks == null) return Map.of();
        return tracks.stream()
            .filter(track -> track != null && track.artist() != null && !track.artist().isBlank())
            .map(track -> track.artist().trim())
            .collect(Collectors.groupingBy(value -> value, TreeMap::new, Collectors.counting()));
    }
}
