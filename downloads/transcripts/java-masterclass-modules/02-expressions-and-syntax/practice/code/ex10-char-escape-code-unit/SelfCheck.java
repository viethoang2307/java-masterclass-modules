public class SelfCheck {
    public static void main(String[] args) {
        if (!"letter=A;code=65;newlineCode=10".equals(Main.result())) throw new AssertionError(Main.result());
        System.out.println("PASS - EX10");
    }
}

