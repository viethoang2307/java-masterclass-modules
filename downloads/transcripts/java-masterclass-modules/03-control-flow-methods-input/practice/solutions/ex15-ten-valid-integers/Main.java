import java.util.Arrays;
import java.util.Scanner;

public class Main {
    static int[] readTenValid(String input) {
        Scanner scanner = new Scanner(input == null ? "" : input);
        int[] values = new int[10];
        int count = 0;
        while (count < values.length && scanner.hasNext()) {
            String token = scanner.next();
            try {
                int value = Integer.parseInt(token);
                values[count++] = value;
            } catch (NumberFormatException ignored) {
                // invalid token does not consume a valid quota slot
            }
        }
        return Arrays.copyOf(values, count);
    }

    public static void main(String[] args) {
        System.out.println(Arrays.toString(readTenValid("1 bad 2")));
    }
}
