public class Main {
    public static String state(String snapshot, String current) {
        if (snapshot == null || current == null) throw new IllegalArgumentException();
        return snapshot.equals(current) ? "CLEAN" : "DIRTY";
    }
}
