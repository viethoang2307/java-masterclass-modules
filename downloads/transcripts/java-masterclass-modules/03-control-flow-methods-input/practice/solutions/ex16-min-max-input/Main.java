import java.util.Scanner;

public class Main {
    static String summarize(String input) {
        Scanner scanner = new Scanner(input == null ? "" : input);
        int count = 0;
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
                count++;
            } catch (NumberFormatException ignored) {
                // consumed invalid token
            }
        }
        return count == 0
                ? "count=0"
                : "count=" + count + ";min=" + min + ";max=" + max;
    }

    public static void main(String[] args) {
        System.out.println(summarize("-5 x 10 3"));
    }
}

