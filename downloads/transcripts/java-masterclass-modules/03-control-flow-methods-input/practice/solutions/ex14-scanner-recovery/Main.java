import java.util.Arrays;
import java.util.Scanner;

public class Main {
    static int[] readValidInts(String input) {
        Scanner scanner = new Scanner(input == null ? "" : input);
        int[] buffer = new int[16];
        int count = 0;
        while (scanner.hasNext()) {
            String token = scanner.next();
            try {
                int value = Integer.parseInt(token);
                if (count == buffer.length) buffer = Arrays.copyOf(buffer, buffer.length * 2);
                buffer[count++] = value;
            } catch (NumberFormatException ignored) {
                // token was consumed and is intentionally skipped
            }
        }
        return Arrays.copyOf(buffer, count);
    }

    public static void main(String[] args) {
        System.out.println(Arrays.toString(readValidInts("10 nope -2 30")));
    }
}
