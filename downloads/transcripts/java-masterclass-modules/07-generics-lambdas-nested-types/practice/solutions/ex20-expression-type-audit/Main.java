import java.math.*;
import java.util.*;

public class Main {
    public record Audit(String args, int wrapped, long safeSum, boolean epsilonEqual,
                        boolean decimalExact, int codePoint, String label) {}

    public static Audit audit(String[] args) {
        String joined = String.join("|", args);
        int wrapped = Integer.MAX_VALUE + 1;
        long safeSum = (long) Integer.MAX_VALUE + 1L;
        boolean epsilonEqual = Math.abs((0.1 + 0.2) - 0.3) < 1e-12;
        boolean decimalExact = new BigDecimal("0.1").add(new BigDecimal("0.2"))
            .compareTo(new BigDecimal("0.3")) == 0;
        char letter = '\u0041';
        boolean valid = joined != null && !joined.isBlank();
        String label = valid ? "args:" + joined : "args:empty";
        return new Audit(joined, wrapped, safeSum, epsilonEqual, decimalExact, letter, label);
    }

    public static String report(Audit audit) {
        return audit.label() + ";wrapped=" + audit.wrapped()
            + ";safeSum=" + audit.safeSum()
            + ";decimalExact=" + audit.decimalExact()
            + ";char=" + (char) audit.codePoint();
    }

    public static void main(String[] args) {
        System.out.println(report(audit(args)));
    }
}

