# 96 — Specialized workers

## Mục tiêu

Hoàn thiện subtype behavior và đảm bảo collection base type vẫn hoạt động.

## Mental model

Dynamic dispatch cho phép thêm subtype không sửa payroll loop. Hãy test subtype mới bằng contract test.

## Ví dụ Java 17

~~~java
`static long total(Worker... workers){ long x=0; for(Worker w:workers)x+=w.pay(); return x; }`
~~~

## Lỗi thường gặp

- Hard-code subtype list.
- Không test zero/negative.
- Override method có side effect bất ngờ.

## Bài tập ngắn

Thêm HourlyWorker mà không sửa total().

## Interview prompt

Open/Closed Principle liên quan thế nào?

## Nguồn

Transcript course lesson 96; ví dụ được chuẩn hóa theo Java 17 và diễn giải theo hướng OOP design.

