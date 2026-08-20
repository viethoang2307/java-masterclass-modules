# Lesson 314 — Object Serialization Basics

## Mục tiêu

Hiểu Serializable, ObjectOutputStream/ObjectInputStream và rủi ro compatibility/security.

## Mental model

Java serialization ghi object graph theo format Java. serialVersionUID kiểm soát compatibility; transient bỏ field khỏi stream.

## Ví dụ Java 17

~~~java
try (ObjectOutputStream out = new ObjectOutputStream(Files.newOutputStream(path))) {
    out.writeObject(snapshot);
}
~~~

## Phân tích

Không deserialize dữ liệu không tin cậy. Serializable không phải format API bền vững; validate class/filter policy.

## Complexity và contract

Cost phụ thuộc object graph; memory có thể lớn do graph traversal.

Ghi rõ encoding, resource ownership, path trust boundary, exception type và cleanup policy.

## Lỗi thường gặp

- Catch Exception rồi bỏ mất context hoặc cause.
- Quên đóng Stream/Reader/Writer/DirectoryStream.
- Nối path bằng String hoặc tin vào exists trước operation.
- Dùng binary/text API không khớp format hoặc charset.

## Bài tập

Serialize private local snapshot trong temp file; test round-trip và reject untrusted boundary trong README.

