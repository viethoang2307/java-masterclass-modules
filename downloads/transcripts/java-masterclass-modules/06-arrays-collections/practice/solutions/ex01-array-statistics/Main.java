public class Main {
    record Stats(int min, int max, long sum, double average) {}
    static Stats statistics(int[] values) {
        if (values == null || values.length == 0) throw new IllegalArgumentException("values must not be empty");
        int min = values[0], max = values[0];
        long sum = 0;
        for (int value : values) {
            min = Math.min(min, value);
            max = Math.max(max, value);
            sum += value;
        }
        return new Stats(min, max, sum, (double) sum / values.length);
    }
}
