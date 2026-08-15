public class SelfCheck {
    private static void check(boolean condition, String message) {
        if (!condition) throw new AssertionError(message);
    }

    public static void main(String[] args) {
        check(Main.run("ADD An 80\nADD Binh 49\nADD Chi 120\nREPORT\n").equals(
                "count=2;fail=1;pass=0;distinction=1;average=64.5"), "mixed");
        check(Main.run("bad\nADD A x\nADD B -1\nREPORT").equals("count=0"), "invalid");
        check(Main.run("ADD A 0\nADD B 50\nADD C 100\nREPORT").equals(
                "count=3;fail=1;pass=1;distinction=1;average=50.0"), "boundaries");
        check(Main.run(null).equals("count=0"), "empty");
        System.out.println("PASS");
    }
}

