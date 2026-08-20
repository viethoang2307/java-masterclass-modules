public class Main {
    public static String counts(int parents) {
        if (parents < 0) throw new IllegalArgumentException();
        return (parents + 1) + ":1";
    }
}
