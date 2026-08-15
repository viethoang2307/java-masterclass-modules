import java.util.Locale;

public class Main {
    static double celsiusToFahrenheit(double celsius) {
        return celsius * 9.0 / 5.0 + 32.0;
    }

    static String temperatureReport(double celsius) {
        return String.format(Locale.ROOT, "%.1fC -> %.1fF",
                celsius, celsiusToFahrenheit(celsius));
    }

    public static void main(String[] args) {
        System.out.println(temperatureReport(25));
    }
}

