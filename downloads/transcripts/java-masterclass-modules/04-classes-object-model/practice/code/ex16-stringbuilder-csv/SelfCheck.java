public class SelfCheck {
    private static void check(boolean ok, String message) {
        if (!ok) throw new AssertionError(message);
    }
    public static void main(String[] args) {
        check(Main.csv(new int[]{1, 2, 3}).equals("1,2,3"), "normal");
        check(Main.csv(new int[]{}).equals(""), "empty");
        check(Main.csv(null).equals(""), "null");
        check(Main.csv(new int[]{-1, 0}).equals("-1,0"), "negative");
        System.out.println("PASS");
    }
}

