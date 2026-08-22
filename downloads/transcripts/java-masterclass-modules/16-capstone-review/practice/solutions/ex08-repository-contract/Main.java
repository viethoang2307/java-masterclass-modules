import java.util.ArrayList;
import java.util.List;

public class Main {
    record Operation(String name, boolean parameterized, boolean closed, boolean translatedError) {}

    static List<String> violations(List<Operation> operations) {
        List<String> result = new ArrayList<>();
        if (operations == null) return result;
        for (Operation operation : operations) {
            if (operation == null || operation.name() == null) continue;
            if (!operation.parameterized()) result.add("unsafe-sql:" + operation.name());
            if (!operation.closed()) result.add("leaked-resource:" + operation.name());
            if (!operation.translatedError()) result.add("leaked-error:" + operation.name());
        }
        return result;
    }
}
