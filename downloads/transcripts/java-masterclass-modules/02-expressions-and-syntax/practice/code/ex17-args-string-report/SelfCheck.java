public class SelfCheck {
    public static void main(String[] args) {
        String expected = "name=Viet;attempts=3;active=true;grade=A";
        if (!expected.equals(Main.report("Viet", 3, true, 'A'))) throw new AssertionError(Main.result());
        System.out.println("PASS - EX17");
    }
}

