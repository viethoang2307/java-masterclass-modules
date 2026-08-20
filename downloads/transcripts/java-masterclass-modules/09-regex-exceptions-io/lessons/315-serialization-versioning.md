# Lesson 315 — Serialization Versioning và transient

## Mục tiêu

Thiết kế serialVersionUID, transient cache và readObject validation ở mức an toàn.

## Mental model

Field derived/cache nên transient và rebuild sau deserialize. Version change cần migration hoặc fail rõ, không cast mù.

## Ví dụ Java 17

~~~java
private static final long serialVersionUID = 1L;
private transient String cached;
private void readObject(ObjectInputStream in)
    throws IOException, ClassNotFoundException {
    in.defaultReadObject();
    validate();
}
~~~

## Phân tích

readObject là security-sensitive; không thực hiện side effect/network. Version UID không thay thế schema migration.

## Complexity và contract

Deserialize cost theo graph; validation O(fields).

Ghi rõ encoding, resource ownership, path trust boundary, exception type và cleanup policy.

## Lỗi thường gặp

- Catch Exception rồi bỏ mất context hoặc cause.
- Quên đóng Stream/Reader/Writer/DirectoryStream.
- Nối path bằng String hoặc tin vào exists trước operation.
- Dùng binary/text API không khớp format hoặc charset.

## Bài tập

Tạo Serializable Config với transient cached value, validate invariant sau round-trip.

