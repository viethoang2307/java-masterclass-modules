import java.util.List;

public class Main {
    record Operation(String name, boolean parameterized, boolean closed, boolean translatedError) {}

    static List<String> violations(List<Operation> operations) {
        // TODO: report unsafe SQL/resource/error-boundary behavior.
        return List.of();
    }
}
