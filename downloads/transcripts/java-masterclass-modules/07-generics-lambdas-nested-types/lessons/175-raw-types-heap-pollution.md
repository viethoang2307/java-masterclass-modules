# Lesson 175 — Raw types và heap pollution

## Mục tiêu

Phân biệt raw type với wildcard; nhận diện heap pollution; và cô lập unchecked warning ở boundary nhỏ.

## Raw type

~~~java
List names = new ArrayList<String>();
names.add("Lan");
names.add(42);
String name = (String) names.get(1);
~~~

Raw reference làm mất kiểm tra khi add, nên lỗi thường nổ muộn ở điểm đọc. Wildcard bảo vệ hơn:

~~~java
List<?> unknown = new ArrayList<String>();
// unknown.add("x"); // không compile
~~~

## Heap pollution

Một variable parameterized type trỏ tới object chứa phần tử sai type là heap pollution.

~~~java
static void corrupt(List<String> strings) {
    List raw = strings;
    raw.add(99);
}
~~~

Cách xử lý: parameterize đầy đủ; dùng ? khi chỉ đọc; adapter legacy validate từng element; @SuppressWarnings chỉ trên method nhỏ kèm invariant.

## Lệnh kiểm tra

Chạy javac -Xlint:unchecked để xem warning. Không tắt warning toàn project chỉ vì code vẫn compile.

## Lỗi thường gặp

Raw Map trong code nghiệp vụ, suppress cả class, và validate bằng getClass() của collection rồi tưởng đã validate element.

## Bài tập

Viết adapter nhận List raw, trả List<String>, validate từng phần tử và ném IllegalArgumentException nếu sai.

