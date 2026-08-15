# 218. Map operations nâng cao

## Mục tiêu

- Dùng `putIfAbsent`, `compute`, `computeIfAbsent`, `merge`, `replace`.
- Hiểu cách remapping function xử lý `null`.

```java
Map<String, Integer> counts = new HashMap<>();
for (String word : List.of("java", "map", "java")) {
    counts.merge(word, 1, Integer::sum);
}
```

```java
Map<String, List<String>> byTeam = new HashMap<>();
byTeam.computeIfAbsent("backend", ignored -> new ArrayList<>())
      .add("An");
```

`compute` có thể xóa mapping nếu remapping function trả `null`. Function nên ngắn, không sửa chính map theo cách khó dự đoán.

## Chọn method

- Chỉ thêm khi thiếu: `putIfAbsent`.
- Khởi tạo collection con: `computeIfAbsent`.
- Cộng dồn/ghép giá trị: `merge`.
- Tính lại dựa trên trạng thái hiện tại: `compute`.

## Bài tập ngắn

Tạo histogram ký tự và inverted index từ token đến tập document ID.

## Interview prompt

`merge` giúp tránh pattern `containsKey` + `get` + `put` như thế nào?

## Nguồn

- Transcript bài 218.
- Java 17 API: `Map` default methods.
