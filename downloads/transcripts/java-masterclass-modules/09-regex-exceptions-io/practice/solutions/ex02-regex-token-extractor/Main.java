import java.util.*;
import java.util.regex.*;

public class Main {
    public record Token(String value, int start, int end) {}
    private static final Pattern TOKEN = Pattern.compile("[A-Z]{2,5}-\\d+");

    public static List<Token> extract(String text) {
        List<Token> result = new ArrayList<>();
        Matcher matcher = TOKEN.matcher(text == null ? "" : text);
        while (matcher.find()) {
            result.add(new Token(matcher.group(), matcher.start(), matcher.end()));
        }
        return List.copyOf(result);
    }

    public static void main(String[] args) {
        System.out.println(extract("ID AB-12 and CD-7"));
    }
}

