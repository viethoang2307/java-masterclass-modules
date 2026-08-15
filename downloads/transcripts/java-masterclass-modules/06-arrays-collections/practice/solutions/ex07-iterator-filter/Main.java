import java.util.Iterator;
import java.util.List;
public class Main {
    static int removeInvalid(List<String> values) {
        if (values == null) throw new IllegalArgumentException("values is null");
        int removed = 0;
        Iterator<String> iterator = values.iterator();
        while (iterator.hasNext()) {
            String value = iterator.next();
            if (value == null || value.isBlank() || !Character.isLetterOrDigit(value.strip().charAt(0))) {
                iterator.remove(); removed++;
            }
        }
        return removed;
    }
}
