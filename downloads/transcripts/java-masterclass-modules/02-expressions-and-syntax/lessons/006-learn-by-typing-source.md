# 006 — Học bằng cách tự gõ source code

## Mục tiêu

Biến transcript thành kỹ năng thực hành: đọc một đoạn code, tự gõ lại, chạy, quan sát lỗi và sửa có lý do.

## Ý chính từ course

Đừng chỉ copy/paste code của giảng viên. Khi tự gõ, bạn phải nhớ vị trí của dấu chấm phẩy, ngoặc, kiểu dữ liệu và tên biến. Những chi tiết nhỏ này tạo nên muscle memory khi lập trình.

Quy trình nên dùng:

1. Xem một đoạn ngắn.
2. Đóng transcript hoặc che code.
3. Tự gõ lại trong IntelliJ/JShell.
4. Chạy ngay.
5. Nếu sai, đọc compiler error và tìm dòng đầu tiên do mình gây ra.
6. So sánh với source chuẩn sau khi đã thử.

~~~mermaid
flowchart LR
    A["Đọc một ý nhỏ"] --> B["Tự gõ"]
    B --> C["Compile / run"]
    C --> D{"Có lỗi?"}
    D -- "Không" --> E["Giải thích lại bằng lời"]
    D -- "Có" --> F["Đọc lỗi đầu tiên"]
    F --> G["Sửa một nguyên nhân"]
    G --> C
~~~

## Ví dụ luyện tập

Tự gõ đoạn này mà không copy:

~~~java
public class TypingPractice {
    public static void main(String[] args) {
        int width = 10;
        int height = 4;
        int area = width * height;
        System.out.println("Area = " + area);
    }
}
~~~

Sau đó cố tình tạo từng lỗi:

- bỏ dấu chấm phẩy sau int width = 10;
- viết String thành string;
- viết Width thay vì width;
- xóa một dấu ngoặc nhọn đóng.

Mục đích là nhìn thấy bốn loại tín hiệu khác nhau: thiếu syntax, sai keyword, sai case và sai cấu trúc block.

## Checklist debug

- Đọc thông báo lỗi từ trên xuống; sửa lỗi đầu tiên trước.
- Kiểm tra line/column được báo, nhưng nhớ rằng nguyên nhân đôi khi nằm ở dòng trước.
- Không đổi nhiều thứ cùng lúc.
- Sau khi sửa, chạy lại ngay để xác nhận giả thuyết.
- Khi code chạy được, tự dự đoán output rồi mới nhìn kết quả.

## Bài tập

1. Tự gõ lại Hello World.
2. Thêm hai biến số và in tổng.
3. Cố tình tạo ba lỗi compile-time, ghi lại thông báo và nguyên nhân.
4. Viết lại đoạn code bằng tên biến rõ nghĩa hơn.

## Nguồn

- Transcript course: lesson 006.
- Oracle: Expressions, Statements, and Blocks.

