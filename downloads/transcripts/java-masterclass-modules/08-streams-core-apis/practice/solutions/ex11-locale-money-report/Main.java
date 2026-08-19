import java.math.*;
import java.text.*;
import java.util.*;

public class Main {
    public static String formatAmount(BigDecimal amount, Locale locale) {
        NumberFormat formatter = NumberFormat.getNumberInstance(locale);
        formatter.setMinimumFractionDigits(2);
        formatter.setMaximumFractionDigits(2);
        return formatter.format(amount);
    }

    public static String report(BigDecimal amount, Locale locale) {
        return locale.toLanguageTag() + "=" + formatAmount(amount, locale);
    }

    public static void main(String[] args) {
        System.out.println(report(new BigDecimal("1234.5"), Locale.US));
    }
}

