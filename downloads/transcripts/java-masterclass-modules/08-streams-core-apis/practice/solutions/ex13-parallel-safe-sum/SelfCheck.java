import java.util.*;
public class SelfCheck {
    static void check(boolean ok, String message) { if (!ok) throw new AssertionError(message); }
    public static void main(String[] args) {
        List<Long> values = java.util.stream.LongStream.rangeClosed(1, 10000).boxed().toList();
        check(Main.safeSum(values) == Main.sequentialSum(values), "same result");
        check(Main.safeSum(List.of()) == 0L, "empty");
        System.out.println("PASS");
    }
}

