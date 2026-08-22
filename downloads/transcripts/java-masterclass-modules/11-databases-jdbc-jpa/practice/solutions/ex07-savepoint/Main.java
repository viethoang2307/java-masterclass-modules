public class Main {
    public static int apply(int base, boolean optionalFails) {
        int value = base + 10;
        int savepoint = value;
        try {
            value += 5;
            if (optionalFails) throw new IllegalStateException();
        } catch (IllegalStateException e) {
            value = savepoint;
        }
        return value;
    }
}
