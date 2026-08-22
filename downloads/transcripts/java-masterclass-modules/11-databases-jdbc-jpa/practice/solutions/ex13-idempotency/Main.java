import java.util.HashSet;
import java.util.Set;

public class Main {
    public static long applyTwice() {
        Set<String> applied = new HashSet<>();
        long balance = 100;
        for (String request : new String[]{"r1", "r1", "r2"}) {
            if (applied.add(request)) balance += 25;
        }
        return balance;
    }
}
