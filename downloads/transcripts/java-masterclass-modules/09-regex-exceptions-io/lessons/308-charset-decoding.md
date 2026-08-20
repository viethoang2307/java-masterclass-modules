# Lesson 308 — Charset và Decoding Policy

## Mục tiêu

Phân biệt bytes, charset và decoded chars; chọn REPORT hoặc REPLACE cho malformed input.

## Mental model

UTF-8 là encoding, không phải mọi byte sequence đều hợp lệ. CharsetDecoder cho phép policy rõ, còn convenience API thường replacement mặc định.

## Ví dụ Java 17

~~~java
CharsetDecoder decoder = StandardCharsets.UTF_8.newDecoder()
    .onMalformedInput(CodingErrorAction.REPORT);
String text = decoder.decode(ByteBuffer.wrap(bytes)).toString();
~~~

## Phân tích

Nếu dữ liệu external cần reject corruption, REPORT tốt hơn replacement im lặng. Không đoán charset bằng mắt từ vài bytes.

## Complexity và contract

Decode O(n) bytes, output O(n) chars.

Ghi rõ encoding, resource ownership, path trust boundary, exception type và cleanup policy.

## Lỗi thường gặp

- Catch Exception rồi bỏ mất context hoặc cause.
- Quên đóng Stream/Reader/Writer/DirectoryStream.
- Nối path bằng String hoặc tin vào exists trước operation.
- Dùng binary/text API không khớp format hoặc charset.

## Bài tập

Viết decodeUtf8(byte[]) ném CharacterCodingException và test byte sequence malformed.

