# 218. Map operations nâng cao

## merge và compute

~~~java
Map<String, Integer> counts = new HashMap<>();
for (String word : List.of("java", "map", "java")) {
    counts.merge(word, 1, Integer::sum);
}
~~~

computeIfAbsent phù hợp map key tới collection:

~~~java
Map<String, List<String>> byTeam = new HashMap<>();
byTeam.computeIfAbsent("backend", ignored -> new ArrayList<>()).add("An");
~~~

putIfAbsent chỉ thêm khi thiếu; compute tính lại từ state hiện tại; merge ghép old/new. Remapping function trả null có thể xóa mapping.

## Bài tập

Tạo histogram, inverted index và inventory merge. Test key vắng, value null, function trả null và overflow.

## Pitfalls

Sửa chính map trong remapping function, chứa side effect khó đoán và dùng containsKey/get/put dài dòng khi merge phù hợp.
