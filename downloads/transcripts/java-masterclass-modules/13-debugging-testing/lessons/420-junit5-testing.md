# Lesson 420 — JUnit 5 testing workflow

## Mục tiêu

Viết unit test có arrange/act/assert rõ; dùng lifecycle, parameterized test, exception assertion và test độc lập với thời gian/randomness.

## Test contract

~~~java
@Test
void rejectsNegativeAmount() {
    Invoice invoice = new Invoice();
    assertThrows(IllegalArgumentException.class,
        () -> invoice.add(-1));
}
~~~

Một test nên kiểm tra behavior quan sát được, không khóa implementation detail. Tên test nói rõ điều kiện và kết quả.

## JUnit 5 cần biết

- @Test, @BeforeEach, @AfterEach.
- assertEquals, assertTrue, assertThrows, assertAll.
- @ParameterizedTest với @ValueSource hoặc @CsvSource.
- Tag để chạy nhóm test.
- Timeout cho operation có boundary rõ.

## Maven integration

mvn test là source of truth; IDE chỉ là convenience. Test không được phụ thuộc thứ tự, file local hoặc timezone máy.

## Lỗi thường gặp

Test quá nhiều thứ, assertion mơ hồ, dùng sleep thay synchronization, và chỉ test happy path.

## Bài tập

Viết test cho parser, money calculation và validation: happy path, boundary, invalid input, null và exception message.
