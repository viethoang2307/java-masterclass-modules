public class SelfCheck {
    public static void main(String[] args) {
        String expected = "long=3000000000;float=0.5;double=2.5";
        if (!expected.equals(Main.result())) throw new AssertionError(Main.result());
        System.out.println("PASS - EX06");
    }
}

