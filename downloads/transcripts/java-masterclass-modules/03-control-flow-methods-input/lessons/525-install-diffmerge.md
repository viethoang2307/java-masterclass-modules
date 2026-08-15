# 525 — Cài DiffMerge và Công cụ So sánh

## Mục tiêu

Hiểu workflow cài một diff tool nhưng vẫn giữ terminal và Git là nguồn kiểm chứng độc lập.

## Mental model

IDE/diff GUI giúp nhìn thay đổi trực quan; compiler và self-check mới là authority cho correctness. Tool chỉ hỗ trợ quan sát, không thay thế test.

## Ví dụ Java 17

~~~java
static boolean sameBehavior(int left, int right) {
    return left == right;
}
~~~

## Lỗi thường gặp

- Tin GUI preview mà không compile.
- So sánh file ở nhầm folder.
- Không ghi version/tooling trong evidence.

## Bài tập ngắn

Ghi checklist cài tool, version, command mở diff và cách fallback khi tool không có.

## Interview prompt

Tại sao một workflow nên có fallback CLI?

## Nguồn

Transcript course lesson 525; ví dụ được chuẩn hóa theo Java 17 và giữ nguyên ý đồ của course.

