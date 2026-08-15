import java.util.List;
public class Main {
    enum Status { PLANNED, IN_PROGRESS, DONE }
    record Task(String id, String description, Status status) {}
    static List<Task> merge(List<Task> tasks) {
        // TODO: use a normalized identity key and an ordered map.
        return tasks;
    }
}
