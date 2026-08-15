public class SelfCheck {
    private static void check(boolean condition, String message) {
        if (!condition) throw new AssertionError(message);
    }

    public static void main(String[] args) {
        check(Main.statistics("1 x 2 6").equals(
                "count=3;sum=9;min=1;max=6;average=3.0"), "mixed");
        check(Main.statistics("-2 -4").equals(
                "count=2;sum=-6;min=-4;max=-2;average=-3.0"), "negative");
        check(Main.statistics("5").equals(
                "count=1;sum=5;min=5;max=5;average=5.0"), "single");
        check(Main.statistics("x").equals("count=0"), "none");
        System.out.println("PASS");
    }
}

