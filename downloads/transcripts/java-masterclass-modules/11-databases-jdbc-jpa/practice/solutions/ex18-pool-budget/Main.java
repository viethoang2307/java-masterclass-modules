public class Main {
    public static String assess(int workers, int connections) {
        if (workers <= 0 || connections <= 0) throw new IllegalArgumentException();
        return workers <= connections ? "SAFE" : "UNSAFE";
    }
}
