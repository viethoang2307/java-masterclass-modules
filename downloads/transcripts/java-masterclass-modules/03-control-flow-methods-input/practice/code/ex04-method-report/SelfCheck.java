public class SelfCheck {
    private static void check(boolean condition, String message) {
        if (!condition) throw new AssertionError(message);
    }

    public static void main(String[] args) {
        check(Math.abs(Main.celsiusToFahrenheit(0) - 32.0) < 1e-9, "freezing");
        check(Math.abs(Main.celsiusToFahrenheit(100) - 212.0) < 1e-9, "boiling");
        check(Main.temperatureReport(0).equals("0.0C -> 32.0F"), "format");
        check(Main.temperatureReport(-40).equals("-40.0C -> -40.0F"), "negative");
        System.out.println("PASS");
    }
}

