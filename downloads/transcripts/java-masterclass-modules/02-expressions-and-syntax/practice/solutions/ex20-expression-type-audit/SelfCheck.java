public class SelfCheck {
    public static void main(String[] args) {
        String expected = "sum=80;total=50800;floatClose=true;money=0.30;grade=A;active=true;label=Java";
        if (!expected.equals(Main.result())) throw new AssertionError(Main.result());
        System.out.println("PASS - EX20");
    }
}

