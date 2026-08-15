public class Main {
    static String parseKeyValue(String line, String expectedKey) {
        if (line == null || expectedKey == null || expectedKey.isBlank()) return null;
        int separator = line.indexOf('=');
        if (separator < 0) return null;
        String key = line.substring(0, separator).strip();
        String value = line.substring(separator + 1).strip();
        if (!key.equals(expectedKey.strip()) || value.isBlank()) return null;
        return value;
    }
    public static void main(String[] args) {
        System.out.println(parseKeyValue("name=An", "name"));
    }
}

