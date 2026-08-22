import java.util.ArrayList;
import java.util.List;

public class Main {
    record Track(String id, String title) {}

    static List<Track> addTrack(List<Track> current, Track track) {
        if (track == null || track.id() == null || track.id().isBlank() || track.title() == null || track.title().isBlank()) throw new IllegalArgumentException();
        List<Track> result = new ArrayList<>(current == null ? List.of() : current);
        if (result.stream().anyMatch(existing -> existing != null && track.id().equals(existing.id()))) throw new IllegalArgumentException("duplicate id");
        result.add(track);
        return List.copyOf(result);
    }
}
