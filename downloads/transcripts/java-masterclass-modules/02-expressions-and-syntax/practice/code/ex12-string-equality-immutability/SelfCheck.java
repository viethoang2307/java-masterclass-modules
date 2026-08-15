public class SelfCheck {
    public static void main(String[] args) {
        String expected = "equals=true;referenceSame=false;original=java;upper=JAVA";
        if (!expected.equals(Main.result())) throw new AssertionError(Main.result());
        System.out.println("PASS - EX12");
    }
}

