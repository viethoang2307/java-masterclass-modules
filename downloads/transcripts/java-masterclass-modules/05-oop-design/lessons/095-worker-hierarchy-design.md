# 95 — Worker hierarchy design

## Mục tiêu

Mô hình hóa Worker với common identity và pay policy cho nhiều loại worker.

## Mental model

Đầu tiên viết contract pay(); sau đó chọn abstract base nếu có common state. Payroll service chỉ nhận Worker.

## Ví dụ Java 17

~~~java
`abstract class Worker { abstract long pay(); }\nfinal class Employee extends Worker { long pay(){return 1000;} }`
~~~

## Lỗi thường gặp

- Base class quá lớn.
- Payroll switch theo subtype.
- Không validate pay input.

## Bài tập ngắn

Tạo Employee/Contractor/Manager và tổng pay polymorphic.

## Interview prompt

Abstract class mang lại gì ngoài code reuse?

## Nguồn

Transcript course lesson 95; ví dụ được chuẩn hóa theo Java 17 và diễn giải theo hướng OOP design.

