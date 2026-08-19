import java.util.IntSummaryStatistics;
import java.util.stream.*;

public class Main {
    public record Stats(long sum, int min, int max, double average) {}

    public static Stats summarize(int[] values) {
        IntSummaryStatistics stats = IntStream.of(values).summaryStatistics();
        if (stats.getCount() == 0) throw new IllegalArgumentException("empty");
        return new Stats(stats.getSum(), stats.getMin(), stats.getMax(), stats.getAverage());
    }

    public static void main(String[] args) {
        System.out.println(summarize(new int[]{2, 4, 6}));
    }
}
