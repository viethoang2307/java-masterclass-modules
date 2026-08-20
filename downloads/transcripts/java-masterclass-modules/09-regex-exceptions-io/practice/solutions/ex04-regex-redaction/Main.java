import java.util.regex.*;

public class Main {
    private static final Pattern EMAIL =
        Pattern.compile("([A-Za-z0-9._%+-]{1,30})@([A-Za-z0-9.-]+\\.[A-Za-z]{2,})");

    public static String redact(String text) {
        if (text == null) return "";
        return EMAIL.matcher(text).replaceAll("$1***@$2");
    }

    public static void main(String[] args) {
        System.out.println(redact("mail an@example.com"));
    }
}

