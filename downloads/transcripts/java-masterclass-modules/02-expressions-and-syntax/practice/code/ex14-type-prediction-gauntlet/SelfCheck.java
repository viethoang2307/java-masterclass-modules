public class SelfCheck {
    public static void main(String[] args) {
        String expected = "first=int:20;second=double:2.5;third=String:A12";
        if (!expected.equals(Main.result())) throw new AssertionError(Main.result());
        System.out.println("PASS - EX14");
    }
}

