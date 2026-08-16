import java.util.*;
import java.util.concurrent.atomic.AtomicInteger;

public class SelfCheck {
    private static void check(boolean ok, String message) {
        if (!ok) throw new AssertionError(message);
    }
    public static void main(String[] args) {
        check("java".equals(Main.normalize(" Java ")), "compose");
        check(Main.parsePositive(" -7 ") == 7, "parse");
        AtomicInteger calls = new AtomicInteger();
        String value = Main.orDefault(Optional.of("present"), () -> {
            calls.incrementAndGet(); return "fallback";
        });
        check("present".equals(value) && calls.get() == 0, "lazy fallback");
        System.out.println("PASS");
    }
}

