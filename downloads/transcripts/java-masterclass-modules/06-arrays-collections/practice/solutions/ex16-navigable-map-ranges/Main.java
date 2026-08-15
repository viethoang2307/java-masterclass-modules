import java.util.Collections;
import java.util.Map;
import java.util.NavigableMap;
import java.util.TreeMap;
public class Main {
    record Query(Map.Entry<Integer,String> active, Map.Entry<Integer,String> next, Map<Integer,String> range) {}
    static Query query(NavigableMap<Integer,String> versions, int target, int from, int to) {
        if (versions == null || from > to) throw new IllegalArgumentException("invalid range");
        Map.Entry<Integer,String> floor = versions.floorEntry(target);
        Map.Entry<Integer,String> higher = versions.higherEntry(target);
        Map.Entry<Integer,String> active = floor == null ? null : Map.entry(floor.getKey(), floor.getValue());
        Map.Entry<Integer,String> next = higher == null ? null : Map.entry(higher.getKey(), higher.getValue());
        Map<Integer,String> range = Collections.unmodifiableMap(new TreeMap<>(versions.subMap(from, true, to, false)));
        return new Query(active, next, range);
    }
}
