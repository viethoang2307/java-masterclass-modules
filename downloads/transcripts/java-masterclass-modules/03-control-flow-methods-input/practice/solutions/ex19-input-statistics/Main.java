import java.util.Locale;
import java.util.Scanner;

public class Main {
    static String statistics(String input) {
        Scanner scanner = new Scanner(input == null ? "" : input);
        int count = 0;
        long sum = 0;
        int min = 0;
        int max = 0;
        while (scanner.hasNext()) {
            String token = scanner.next();
            try {
                int value = Integer.parseInt(token);
                if (count == 0) {
                    min = value;
                    max = value;
                } else {
                    min = Math.min(min, value);
                    max = Math.max(max, value);
                }
                sum += value;
                count++;
            } catch (NumberFormatException ignored) {
                // invalid token is consumed
            }
        }
        if (count == 0) return "count=0";
        double average = (double) sum / count;
        return String.format(Locale.ROOT,
                "count=%d;sum=%d;min=%d;max=%d;average=%.1f",
                count, sum, min, max, average);
    }

    public static void main(String[] args) {
        System.out.println(statistics("1 x 2 6"));
    }
}

