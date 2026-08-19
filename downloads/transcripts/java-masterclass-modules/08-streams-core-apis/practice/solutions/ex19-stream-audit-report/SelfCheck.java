import java.util.*;
public class SelfCheck {
    static void check(boolean ok, String message) { if (!ok) throw new AssertionError(message); }
    public static void main(String[] args) {
        Main.Report report = Main.analyze(Arrays.asList(2, 11, 4, null, -3));
        check(report.evenSquares().equals(List.of(4, 16)), "squares");
        check(report.firstOverTen().orElseThrow() == 11, "first");
        check(report.positiveSum() == 17, "sum");
        System.out.println("PASS");
    }
}

