import java.util.regex.*;

public class Main {
    private static final Pattern USERNAME =
        Pattern.compile("[A-Za-z][A-Za-z0-9_]{2,15}");

    public static boolean valid(String value) {
        return value != null && USERNAME.matcher(value).matches();
    }

    public static void main(String[] args) {
        System.out.println(valid("java_17"));
    }
}

