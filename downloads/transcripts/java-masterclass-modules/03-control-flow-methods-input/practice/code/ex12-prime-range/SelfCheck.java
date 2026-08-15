public class SelfCheck {
    private static void check(boolean condition, String message) {
        if (!condition) throw new AssertionError(message);
    }

    public static void main(String[] args) {
        check(Main.isPrime(2), "2");
        check(Main.isPrime(17), "17");
        check(!Main.isPrime(1), "1");
        check(!Main.isPrime(9), "9");
        check(Main.countPrimes(1, 10) == 4, "range");
        check(Main.countPrimes(10, 1) == 0, "reverse");
        System.out.println("PASS");
    }
}

