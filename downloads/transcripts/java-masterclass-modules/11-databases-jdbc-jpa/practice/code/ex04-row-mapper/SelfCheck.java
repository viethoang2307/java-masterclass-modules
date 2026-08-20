public class SelfCheck {
    public static void main(String[] args) {
        if (!"7:a@example.com:NONE".equals(Main.map(7, "a@example.com", null))) throw new AssertionError();
        if (!"8:b@example.com:0".equals(Main.map(8, "b@example.com", 0L))) throw new AssertionError();
        System.out.println("PASS");
    }
}
