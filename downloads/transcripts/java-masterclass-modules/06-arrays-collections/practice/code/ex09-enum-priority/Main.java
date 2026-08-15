import java.util.List;
public class Main {
    enum Priority { LOW, MEDIUM, HIGH, CRITICAL }
    record Job(String name, Priority priority) {}
    static String label(Priority priority) {
        // TODO: return a label using a switch expression.
        return "";
    }
    static List<Job> schedule(List<Job> jobs) {
        // TODO: sort a copy by priority weight descending, then name.
        return jobs;
    }
}
