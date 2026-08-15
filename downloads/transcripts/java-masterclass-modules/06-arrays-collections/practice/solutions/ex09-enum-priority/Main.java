import java.util.ArrayList;
import java.util.Comparator;
import java.util.List;
public class Main {
    enum Priority {
        LOW(4, 72), MEDIUM(3, 24), HIGH(2, 4), CRITICAL(1, 1);
        final int code, slaHours;
        Priority(int code, int slaHours) { this.code = code; this.slaHours = slaHours; }
    }
    record Job(String name, Priority priority) {}
    static String label(Priority priority) {
        if (priority == null) throw new IllegalArgumentException("priority is null");
        return switch (priority) { case CRITICAL -> "P0/1h"; case HIGH -> "P1/4h"; case MEDIUM -> "P2/24h"; case LOW -> "P3/72h"; };
    }
    static List<Job> schedule(List<Job> jobs) {
        if (jobs == null || jobs.stream().anyMatch(j -> j == null || j.name() == null || j.priority() == null)) throw new IllegalArgumentException("invalid jobs");
        List<Job> copy = new ArrayList<>(jobs);
        copy.sort(Comparator.comparingInt((Job j) -> j.priority().code).thenComparing(Job::name));
        return List.copyOf(copy);
    }
}
