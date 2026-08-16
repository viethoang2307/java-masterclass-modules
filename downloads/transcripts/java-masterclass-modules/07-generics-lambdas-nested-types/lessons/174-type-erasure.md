# Lesson 174 — Type erasure

## Mục tiêu

Giải thích vì sao generic được kiểm tra ở compile time nhưng phần lớn type parameter không còn ở runtime; và thiết kế API khi cần class token.

## Mental model

Compiler kiểm tra Generic type trước, sau đó erasure biến T thành Object hoặc bound đầu tiên. JVM không tạo class riêng cho List<String> và List<Integer>; compiler chèn cast ở điểm đọc.

~~~java
List<String> names = new ArrayList<>();
names.add("An");
String first = names.get(0);
~~~

Không dùng được instanceof List<String>, không tạo trực tiếp new T(), và không overload hai method chỉ khác generic type sau erasure.

## Class token

Khi runtime cần biết type cụ thể, caller truyền Class<T>.

~~~java
static <T> T create(Class<T> type) throws ReflectiveOperationException {
    return type.getDeclaredConstructor().newInstance();
}
~~~

Class<T> là cây cầu bổ sung thông tin đã mất do erasure. Reflection vẫn phải kiểm tra constructor, access và exception policy.

## Bridge method

Compiler có thể sinh bridge method khi generic override có covariant return type. Điều này giải thích một số stack trace/reflection thấy method tổng hợp hoặc Object.

## Lỗi thường gặp

Nghĩ mỗi T có một runtime class, cast unchecked để né API, và phụ thuộc vào tên bytecode có dấu $.

## Bài tập

Viết parse(Class<T>, String) hỗ trợ Integer và String. Ghi phần được compiler bảo vệ và phần cần runtime validation.

