# Lesson 306 — Scanner và Token Input

## Mục tiêu

Dùng Scanner cho interactive/token input nhỏ; hiểu delimiter, hasNext và exception policy.

## Mental model

Scanner tiện cho console nhưng chậm hơn buffered parsing và có ambiguity newline sau nextInt. Với file lớn, Files.lines/BufferedReader thường rõ hơn.

## Ví dụ Java 17

~~~java
try (Scanner scanner = new Scanner(input, StandardCharsets.UTF_8)) {
    while (scanner.hasNextInt()) System.out.println(scanner.nextInt());
}
~~~

## Phân tích

hasNext/next phải đi theo cùng grammar; InputMismatchException không nên nuốt. Scanner close sẽ close underlying stream.

## Complexity và contract

Cost theo token và regex delimiter nội bộ; memory nhỏ.

Ghi rõ encoding, resource ownership, path trust boundary, exception type và cleanup policy.

## Lỗi thường gặp

- Catch Exception rồi bỏ mất context hoặc cause.
- Quên đóng Stream/Reader/Writer/DirectoryStream.
- Nối path bằng String hoặc tin vào exists trước operation.
- Dùng binary/text API không khớp format hoặc charset.

## Bài tập

Viết parser đọc menu input từ String/ByteArrayInputStream, reject token sai và không đọc quá EOF.

