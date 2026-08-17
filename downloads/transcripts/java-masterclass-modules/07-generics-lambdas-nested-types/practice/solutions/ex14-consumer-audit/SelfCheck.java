import java.util.*;

public class SelfCheck {
    private static void check(boolean ok, String message) {
        if (!ok) throw new AssertionError(message);
    }
    public static void main(String[] args) {
        check(Main.process(List.of(" a ", "b")).equals(
            List.of("N:a", "P:a", "N:b", "P:b")), "order");
        List<Object> sink = new ArrayList<>();
        Main.sendAll(List.of("x", "y"), sink::add);
        check(sink.equals(List.of("x", "y")), "consumer variance");
        System.out.println("PASS");
    }
}

