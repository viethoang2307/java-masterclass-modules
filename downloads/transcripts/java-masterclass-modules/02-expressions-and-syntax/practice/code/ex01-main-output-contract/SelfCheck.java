public class SelfCheck {
    public static void main(String[] args) {
        if (!"Hello, Java 17!".equals(Main.result())) {
            throw new AssertionError("Output contract mismatch");
        }
        System.out.println("PASS - EX01");
    }
}

