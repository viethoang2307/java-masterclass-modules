import java.io.*;
import java.util.regex.Pattern;

public class Module09Example {
    private static final Pattern ID = Pattern.compile("[A-Z]{2}-\\d{4}");
    static String readId(Reader source) throws IOException {
        try (BufferedReader reader = new BufferedReader(source)) {
            String value = reader.readLine();
            if (value == null || !ID.matcher(value).matches())
                throw new IllegalArgumentException("invalid id");
            return value;
        }
    }
    public static void main(String[] args) throws IOException {
        System.out.println(readId(new StringReader("AB-1234")));
    }
}