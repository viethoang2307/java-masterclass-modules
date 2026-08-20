public class Main {
    public static final class FormatException extends Exception {
        public FormatException(String message, Throwable cause) { super(message, cause); }
    }

    public static int parsePositive(String text) throws FormatException {
        try {
            int value = Integer.parseInt(text);
            if (value <= 0) throw new FormatException("must be positive: " + text, null);
            return value;
        } catch (NumberFormatException ex) {
            throw new FormatException("not an integer: " + text, ex);
        }
    }

    public static void main(String[] args) throws Exception {
        System.out.println(parsePositive("42"));
    }
}

