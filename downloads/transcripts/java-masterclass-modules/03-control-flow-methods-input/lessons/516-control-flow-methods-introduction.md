# 516 — Introduction: Control Flow và Methods

## Mục tiêu

Nhìn module như ba lớp: expressions quyết định giá trị, control flow quyết định đường đi, methods đóng gói hành vi.

## Mental model

Có thể hình dung chương trình như đồ thị: branch tạo nhánh, loop tạo cạnh quay lại, method tạo boundary có input/output. Thiết kế boundary sớm giúp test độc lập.

## Ví dụ Java 17

~~~java
static String classify(int score) {
    if (score < 0 || score > 100) return "invalid";
    return score >= 50 ? "pass" : "fail";
}
~~~

## Lỗi thường gặp

- Method làm quá nhiều việc.
- Không phân biệt return value với print side effect.
- Loop/branch không có invariant hoặc termination condition.

## Bài tập ngắn

Vẽ flow diagram cho score classifier rồi chuyển mỗi decision quan trọng thành test case.

## Interview prompt

Khi nào một method nên return value thay vì trực tiếp print?

## Nguồn

Transcript course lesson 516; ví dụ được chuẩn hóa theo Java 17 và giữ nguyên ý đồ của course.

