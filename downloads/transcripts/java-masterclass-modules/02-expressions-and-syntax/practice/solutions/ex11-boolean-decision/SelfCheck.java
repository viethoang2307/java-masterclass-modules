public class SelfCheck {
    public static void main(String[] args) {
        if (!"canEnter=true;needsReset=false".equals(Main.result())) throw new AssertionError(Main.result());
        System.out.println("PASS - EX11");
    }
}

