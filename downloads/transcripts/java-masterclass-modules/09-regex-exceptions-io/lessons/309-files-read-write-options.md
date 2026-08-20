# Lesson 309 — Files Read/Write Options

## Mục tiêu

Đọc API option-driven: CREATE, CREATE_NEW, TRUNCATE_EXISTING, APPEND, WRITE.

## Mental model

Files.write nhận byte[]/Iterable<String>; options quyết định atomicity/overwrite. CREATE_NEW giúp fail nếu file đã tồn tại.

## Ví dụ Java 17

~~~java
Files.write(path, lines, UTF_8,
    CREATE_NEW, WRITE);
Files.writeString(path, "more\n", UTF_8, APPEND);

~~~

## Phân tích

CREATE_NEW race vẫn cần filesystem semantics; APPEND không đảm bảo multi-process record atomicity cho mọi FS. Validate parent directory.

## Complexity và contract

O(n) theo input/output; memory tùy overload.

Ghi rõ encoding, resource ownership, path trust boundary, exception type và cleanup policy.

## Lỗi thường gặp

- Catch Exception rồi bỏ mất context hoặc cause.
- Quên đóng Stream/Reader/Writer/DirectoryStream.
- Nối path bằng String hoặc tin vào exists trước operation.
- Dùng binary/text API không khớp format hoặc charset.

## Bài tập

Tạo safe write API có mode CREATE_NEW/REPLACE/APPEND và test từng mode.

