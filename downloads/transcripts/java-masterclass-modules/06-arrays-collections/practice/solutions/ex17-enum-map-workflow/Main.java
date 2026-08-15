import java.util.EnumMap;
import java.util.EnumSet;
import java.util.HashMap;
import java.util.Map;
public class Main {
    enum State { NEW, ACTIVE, BLOCKED, DONE }
    static final class Workflow {
        private static final EnumMap<State, EnumSet<State>> ALLOWED = new EnumMap<>(State.class);
        static {
            ALLOWED.put(State.NEW, EnumSet.of(State.ACTIVE));
            ALLOWED.put(State.ACTIVE, EnumSet.of(State.BLOCKED, State.DONE));
            ALLOWED.put(State.BLOCKED, EnumSet.of(State.ACTIVE));
            ALLOWED.put(State.DONE, EnumSet.noneOf(State.class));
        }
        private final Map<String,State> states = new HashMap<>();
        void add(String id) {
            String key = key(id); if (states.putIfAbsent(key, State.NEW) != null) throw new IllegalArgumentException("duplicate id");
        }
        boolean transition(String id, State next) {
            if (next == null) throw new IllegalArgumentException("next is null");
            String key = key(id); State current = states.get(key);
            if (current == null) throw new IllegalArgumentException("unknown id");
            if (!ALLOWED.get(current).contains(next)) return false;
            states.put(key, next); return true;
        }
        State state(String id) { return states.get(key(id)); }
        Map<State,Integer> counts() {
            EnumMap<State,Integer> counts = new EnumMap<>(State.class);
            for (State state : State.values()) counts.put(state, 0);
            for (State state : states.values()) counts.merge(state, 1, Integer::sum);
            return Map.copyOf(counts);
        }
        private static String key(String id) { if (id == null || id.isBlank()) throw new IllegalArgumentException("id"); return id.strip(); }
    }
}
