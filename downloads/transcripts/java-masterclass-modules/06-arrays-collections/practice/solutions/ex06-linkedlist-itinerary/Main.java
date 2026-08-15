import java.util.LinkedList;
import java.util.ListIterator;
public class Main {
    static boolean insertOrdered(LinkedList<String> itinerary, String destination) {
        if (itinerary == null || destination == null || destination.strip().isEmpty()) throw new IllegalArgumentException("invalid input");
        String cleaned = destination.strip();
        ListIterator<String> iterator = itinerary.listIterator();
        while (iterator.hasNext()) {
            int comparison = iterator.next().compareToIgnoreCase(cleaned);
            if (comparison == 0) return false;
            if (comparison > 0) { iterator.previous(); iterator.add(cleaned); return true; }
        }
        iterator.add(cleaned);
        return true;
    }
}
