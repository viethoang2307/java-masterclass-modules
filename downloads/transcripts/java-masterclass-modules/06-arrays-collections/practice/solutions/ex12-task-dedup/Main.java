import java.util.ArrayList;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Locale;
import java.util.Map;
public class Main {
    enum Status { PLANNED, IN_PROGRESS, DONE }
    record Task(String id, String description, Status status) {}
    static List<Task> merge(List<Task> tasks) {
        if (tasks == null) throw new IllegalArgumentException("tasks is null");
        Map<String, Task> byId = new LinkedHashMap<>();
        for (Task task : tasks) {
            if (task == null || task.id() == null || task.id().isBlank() || task.description() == null || task.status() == null) throw new IllegalArgumentException("invalid task");
            String key = task.id().strip().toLowerCase(Locale.ROOT);
            Task cleaned = new Task(task.id().strip(), task.description().strip(), task.status());
            byId.merge(key, cleaned, (oldTask, newTask) -> newTask.status().ordinal() > oldTask.status().ordinal() ? newTask : oldTask);
        }
        return List.copyOf(new ArrayList<>(byId.values()));
    }
}
