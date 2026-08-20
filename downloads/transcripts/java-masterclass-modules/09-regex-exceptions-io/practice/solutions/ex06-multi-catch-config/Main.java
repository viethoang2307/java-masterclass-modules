import java.util.*;

public class Main {
    public static final class ConfigException extends Exception {
        public ConfigException(String message, Throwable cause) { super(message, cause); }
    }

    public static Map<String, Integer> parse(String line) throws ConfigException {
        try {
            String[] parts = Objects.requireNonNull(line).split("=", 2);
            if (parts.length != 2 || parts[0].isBlank()) throw new IllegalArgumentException("key");
            int value = Integer.parseInt(parts[1].trim());
            return Map.of(parts[0].trim(), value);
        } catch (IllegalArgumentException | NullPointerException ex) {
            throw new ConfigException("invalid config line", ex);
        }
    }

    public static void main(String[] args) throws Exception {
        System.out.println(parse("port=8080"));
    }
}


