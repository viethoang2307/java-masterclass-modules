# Lesson 198 — Capstone: Generics, nested types và lambdas

## Mục tiêu

Tích hợp generic repository, wildcard variance, mapping, nested query và lambda-based filtering/sorting.

~~~java
interface Identifiable { String id(); }

final class Catalog<T extends Identifiable> {
    private final Map<String, T> data = new LinkedHashMap<>();
    Catalog(Collection<? extends T> initial) {
        initial.forEach(item -> data.put(item.id(), item));
    }
    Optional<T> find(Predicate<? super T> rule) {
        return data.values().stream().filter(rule).findFirst();
    }
    <R> List<R> map(Function<? super T, ? extends R> mapper) {
        return data.values().stream().map(mapper).toList();
    }
    static final class Query<T> {
        private Predicate<? super T> filter = value -> true;
        private Comparator<? super T> order;
    }
}
~~~

## Acceptance criteria

Không raw type/unchecked cast; initial collection nhận subtype; query có filter chain, comparator và limit; catalog không lộ mutable state; duplicate id và null policy được ghi rõ; complexity được giải thích.

## Forensic checklist

- Type nào bị erasure và runtime có cần Class<T>?
- Lambda capture có giữ object graph không?
- Comparator contract có an toàn trong TreeSet?
- Nested class nên static hay inner?
- Exception và side effect có boundary rõ không?

## Bài tập

Hoàn thiện Catalog với Query immutable hoặc copy-on-write, export mapper và audit report về type decisions, complexity, null policy và test evidence.

