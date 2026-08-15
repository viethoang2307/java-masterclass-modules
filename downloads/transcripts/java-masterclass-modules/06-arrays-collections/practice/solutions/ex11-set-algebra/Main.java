import java.util.HashSet;
import java.util.Set;
public class Main {
    record Algebra<T>(Set<T> union, Set<T> intersection, Set<T> leftOnly, Set<T> symmetricDifference) {}
    static <T> Algebra<T> analyze(Set<T> left, Set<T> right) {
        if (left == null || right == null) throw new IllegalArgumentException("null set");
        Set<T> union = new HashSet<>(left); union.addAll(right);
        Set<T> intersection = new HashSet<>(left); intersection.retainAll(right);
        Set<T> leftOnly = new HashSet<>(left); leftOnly.removeAll(right);
        Set<T> symmetric = new HashSet<>(union); symmetric.removeAll(intersection);
        return new Algebra<>(Set.copyOf(union), Set.copyOf(intersection), Set.copyOf(leftOnly), Set.copyOf(symmetric));
    }
}
