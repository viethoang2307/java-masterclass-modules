public class Main {
    public static <T> T parse(Class<T> type, String text) {
        Object value;
        if (type == String.class) value = text;
        else if (type == Integer.class) value = Integer.valueOf(text);
        else if (type == Long.class) value = Long.valueOf(text);
        else throw new IllegalArgumentException("unsupported type: " + type.getName());
        return type.cast(value);
    }

    public static <T> T firstOrDefault(java.util.List<? extends T> values, T fallback) {
        return values.isEmpty() ? fallback : values.get(0);
    }

    public static void main(String[] args) {
        System.out.println(parse(Integer.class, "42"));
    }
}

