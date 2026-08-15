public class Main {
    record Stats(int min, int max, long sum, double average) {}

    static Stats statistics(int[] values) {
        // TODO: validate input and calculate all statistics in one traversal.
        return new Stats(0, 0, 0, 0.0);
    }
}
