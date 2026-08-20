public class Main {
    public static String page(int start, int size, int total) {
        if (start < 0 || size <= 0 || total < 0 || start > total) throw new IllegalArgumentException();
        int end = Math.min(start + size, total);
        return start + ":" + end + ":" + (end < total);
    }
}
