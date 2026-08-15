import java.util.Map;
import java.util.NavigableMap;
public class Main {
    record Query(Map.Entry<Integer,String> active, Map.Entry<Integer,String> next, Map<Integer,String> range) {}
    static Query query(NavigableMap<Integer,String> versions, int target, int from, int to) {
        // TODO: use floorEntry, higherEntry and subMap with explicit endpoints.
        return null;
    }
}
