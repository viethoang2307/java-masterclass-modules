import java.util.Map;
public class Main {
    enum State { NEW, ACTIVE, BLOCKED, DONE }
    static final class Workflow {
        void add(String id) { /* TODO */ }
        boolean transition(String id, State next) { return false; /* TODO */ }
        State state(String id) { return null; /* TODO */ }
        Map<State,Integer> counts() { return Map.of(); /* TODO */ }
    }
}
