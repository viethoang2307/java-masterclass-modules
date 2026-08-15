public class SelfCheck {
    private static void check(boolean condition, String message) {
        if (!condition) throw new AssertionError(message);
    }

    public static void main(String[] args) {
        check(Main.run("ADD 10\nREMOVE 3\nSHOW\nQUIT\n").equals("balance=7;events=3"), "normal");
        check(Main.run("REMOVE 10\nADD 4\nQUIT").equals("balance=4;events=2"), "floor");
        check(Main.run("ADD x\nBOGUS 3\nADD -1\nQUIT").equals("balance=0;events=0"), "invalid");
        check(Main.run(null).equals("balance=0;events=0"), "empty");
        System.out.println("PASS");
    }
}

