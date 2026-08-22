import java.util.List;

public class Main {
    record Check(String id, boolean passed, int weight) {}

    static int score(List<Check> checks) {
        // TODO: sum positive weights for passed checks and reject invalid weights.
        return 0;
    }
    static String status(List<Check> checks) {
        // TODO: return READY only when every check passes.
        return "";
    }
}
