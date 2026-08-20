import java.util.List;

public class SelfCheck {
    public static void main(String[] args) {
        var input = List.of(new Main.Requirement("US-1", true, true, true), new Main.Requirement("US-2", true, false, true), new Main.Requirement("US-3", false, false, false));
        check(Main.missingEvidence(input).equals(List.of("US-2", "US-3")));
        System.out.println("PASS");
    }
    private static void check(boolean value) { if (!value) throw new AssertionError(); }
}
