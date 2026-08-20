import java.util.*;

public class Main {
    public static int sumCsv(String input) {
        try (Scanner scanner = new Scanner(input == null ? "" : input)) {
            scanner.useDelimiter("\\s*,\\s*");
            int sum = 0;
            while (scanner.hasNext()) sum = Math.addExact(sum, scanner.nextInt());
            return sum;
        } catch (InputMismatchException | ArithmeticException ex) {
            throw new IllegalArgumentException("invalid integer CSV", ex);
        }
    }

    public static void main(String[] args) {
        System.out.println(sumCsv("1, 2, 3"));
    }
}

