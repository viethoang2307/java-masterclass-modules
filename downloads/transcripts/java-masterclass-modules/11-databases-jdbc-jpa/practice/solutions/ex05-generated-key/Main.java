public class Main {
    public static long firstKey(long[] keys) {
        if (keys == null || keys.length == 0) throw new IllegalStateException("missing generated key");
        return keys[0];
    }
}
