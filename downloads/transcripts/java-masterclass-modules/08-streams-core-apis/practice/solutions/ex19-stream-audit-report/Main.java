import java.util.*;
import java.util.stream.*;

public class Main {
    public record Report(List<Integer> evenSquares, OptionalInt firstOverTen, long positiveSum) {}

    public static Report analyze(List<Integer> values) {
        List<Integer> evenSquares = values.stream()
            .filter(Objects::nonNull)
            .filter(value -> value % 2 == 0)
            .map(value -> value * value)
            .toList();
        OptionalInt firstOverTen = values.stream()
            .filter(Objects::nonNull)
            .mapToInt(Integer::intValue)
            .filter(value -> value > 10)
            .findFirst();
        long positiveSum = values.stream()
            .filter(Objects::nonNull)
            .mapToLong(Integer::longValue)
            .filter(value -> value > 0)
            .sum();
        return new Report(evenSquares, firstOverTen, positiveSum);
    }

    public static void main(String[] args) {
        System.out.println(analyze(List.of(2, 11, 4)));
    }
}

