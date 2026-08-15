public class SelfCheck {
    public static void main(String[] args) {
        String expected = "promoted=80;widened=80;narrowed=-126;total=50800";
        if (!expected.equals(Main.result())) throw new AssertionError(Main.result());
        System.out.println("PASS - EX18");
    }
}

