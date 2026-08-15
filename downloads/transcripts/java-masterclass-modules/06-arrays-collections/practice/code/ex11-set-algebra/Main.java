import java.util.Set;
public class Main {
    record Algebra<T>(Set<T> union, Set<T> intersection, Set<T> leftOnly, Set<T> symmetricDifference) {}
    static <T> Algebra<T> analyze(Set<T> left, Set<T> right) {
        // TODO: calculate each result from defensive working copies.
        return null;
    }
}
