public class SelfCheck {
    public static void main(String[] args) {
        String expected = "byte=-128;int=-2147483648;intMin=-2147483648";
        if (!expected.equals(Main.result())) throw new AssertionError(Main.result());
        System.out.println("PASS - EX09");
    }
}

