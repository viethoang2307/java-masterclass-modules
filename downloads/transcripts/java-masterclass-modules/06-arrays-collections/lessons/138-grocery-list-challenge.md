# 138. Grocery list challenge

## Thiết kế trước khi code

Quyết định duplicate có hợp lệ không, case có quan trọng không, blank có được giữ không, output giữ insertion order hay sort. Nếu uniqueness là invariant, Set có thể phù hợp hơn List; nếu cần first occurrence và display spelling, dùng List cùng một Set key.

~~~java
List<String> result = new ArrayList<>();
Set<String> seen = new HashSet<>();
for (String raw : input) {
    if (raw == null || raw.isBlank()) continue;
    String item = raw.strip();
    if (seen.add(item.toLowerCase(Locale.ROOT))) result.add(item);
}
~~~

## API boundary

Không trả internal mutable list. Trả List.copyOf(result). Normalization phải nhất quán ở insert và lookup.

## Bài tập

Thêm remove theo normalized key, rename item và report duplicate count. Test case-insensitive duplicate, whitespace, null, empty và caller mutate input.

## Lỗi thường gặp

Dùng TreeSet làm mất insertion order, trim sau khi deduplicate, và expose ArrayList.
