import java.util.*;
public class SelfCheck {
    static void check(boolean ok, String message) { if (!ok) throw new AssertionError(message); }
    public static void main(String[] args) {
        check(Main.joinUpper(List.of("java", "stream", "api")).equals("JAVA|STREAM|API"), "join");
        check(Main.joinUpper(List.of()).equals(""), "empty");
        System.out.println("PASS");
    }
}

