public class SelfCheck {
    public static void main(String[] args) {
        if (!"direct=false;epsilon=true".equals(Main.result())) throw new AssertionError(Main.result());
        System.out.println("PASS - EX15");
    }
}

