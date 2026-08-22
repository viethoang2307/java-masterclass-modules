# Bài 01 — Smart Workspace

**Độ khó:** Hard
**Mục tiêu:** Thiết kế một aggregate sử dụng composition để điều khiển nhiều thiết bị, bảo vệ state transition và cho phép thay dependency bằng fake object khi test.

## Bối cảnh

Xây dựng module quản lý một workspace gồm màn hình, bàn phím, máy in và bộ nguồn. Workspace không phải là một loại Monitor, Keyboard hay Printer; nó sở hữu và điều phối các component đó.

Mục tiêu của bài là chứng minh rằng:

- Quan hệ HAS-A được mô hình hóa bằng composition.
- Caller không được tự ý thay đổi state của component.
- Aggregate là nơi điều phối workflow và bảo vệ invariant.
- Dependency được truyền qua constructor để test không cần thiết bị thật.

## Phạm vi domain

### 1. PowerUnit

PowerUnit quản lý trạng thái nguồn.

Yêu cầu:

- Có trạng thái OFF và ON.
- Khởi tạo ở OFF.
- turnOn() chuyển từ OFF sang ON.
- turnOff() chuyển từ ON sang OFF.
- Gọi lặp lại cùng một command không được làm hỏng state.
- Có accessor chỉ đọc trạng thái.

### 2. Monitor

Monitor phụ thuộc vào PowerUnit.

Yêu cầu:

- Không được bật monitor khi power đang OFF.
- turnOn() chỉ thành công khi power đang ON.
- turnOff() đưa monitor về trạng thái tắt.
- Monitor không được tự tạo PowerUnit bên trong constructor.
- PowerUnit phải được truyền từ bên ngoài.

### 3. Keyboard

Keyboard có trạng thái DISCONNECTED và CONNECTED.

Yêu cầu:

- Khởi tạo ở DISCONNECTED.
- Chỉ connect được khi power đang ON.
- Có method đọc trạng thái.
- Không expose field mutable.

### 4. Printer

Printer có trạng thái READY, BUSY và OFFLINE.

Yêu cầu:

- Khởi tạo ở OFFLINE.
- Chỉ chuyển sang READY khi workspace bật thành công.
- print(String document) chỉ nhận document không null và không blank.
- Không được print khi printer chưa READY.
- Sau khi print xong, printer trở lại READY.
- Có thể lưu số tài liệu đã in để test.

### 5. Workspace

Workspace là aggregate root và phải chứa:

- PowerUnit
- Monitor
- Keyboard
- Printer

Các dependency được inject qua constructor.

Yêu cầu constructor:

- Từ chối dependency null.
- Không nhận collection mutable không cần thiết.
- Không expose trực tiếp component nội bộ bằng setter.

Các command bắt buộc:

| Method | Hành vi |
|---|---|
| boot() | bật power, monitor, keyboard và printer theo đúng thứ tự |
| shutdown() | ngắt printer, monitor, keyboard và power |
| print(String) | chỉ print khi workspace ready |
| isReady() | trả true khi toàn bộ component cần thiết sẵn sàng |
| status() | trả snapshot immutable của workspace |

boot() phải idempotent: gọi nhiều lần không tạo state sai hoặc tăng counter không hợp lý.

## Snapshot

Tạo record immutable, ví dụ WorkspaceStatus, chứa tối thiểu:

- power state
- monitor state
- keyboard state
- printer state
- số tài liệu đã in

Snapshot chỉ mô tả trạng thái, không được phép thay đổi workspace.

## Test fake

Tạo ít nhất một fake component hoặc fake event recorder để kiểm tra thứ tự operation.

Thứ tự mong muốn khi boot:

~~~
POWER_ON
MONITOR_ON
KEYBOARD_CONNECT
PRINTER_READY
~~~

Không kiểm tra thứ tự bằng cách đọc private field. Hãy inject collaborator có thể ghi event hoặc dùng public behavior.

## Acceptance criteria

- Workspace không extends bất kỳ component nào.
- Có ít nhất bốn quan hệ composition rõ ràng.
- Dependency null bị từ chối ngay tại constructor.
- Không có public field.
- Caller không thể trực tiếp bật/tắt monitor bằng cách sửa field.
- print() bị từ chối khi workspace chưa ready.
- shutdown() đưa toàn bộ aggregate về state nhất quán.
- Snapshot không làm lộ mutable state.
- Có test cho boot, shutdown, print hợp lệ, print không hợp lệ và dependency null.

## Bonus

- Tạo WorkspaceEvent sealed hierarchy cho Booted, Shutdown, Printed, Rejected.
- Cho phép inject Clock để ghi thời gian event mà không gọi System.currentTimeMillis() trực tiếp trong domain.
- Viết adapter ConsolePrinter và RecordingPrinter cùng implement một port chung.
