import java.util.List;

public class Main {
    record Track(String id, String title) {}

    static List<Track> addTrack(List<Track> current, Track track) {
        // TODO: return a new immutable list and reject blank/duplicate IDs.
        return List.of();
    }
}
