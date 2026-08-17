import java.util.*;
import java.util.function.*;

public class Main {
    public static Map<String, Supplier<List<String>>> factories() {
        Map<String, Supplier<List<String>>> result = new LinkedHashMap<>();
        result.put("array", ArrayList::new);
        result.put("linked", LinkedList::new);
        return result;
    }

    public static List<Integer> lengths(List<String> values) {
        Function<String, Integer> length = String::length;
        return values.stream().map(length).toList();
    }

    public static List<String> printAndReturn(List<String> values, Consumer<String> printer) {
        values.forEach(printer);
        return values;
    }

    public static void main(String[] args) {
        System.out.println(factories().get("array").get().getClass().getSimpleName());
    }
}

