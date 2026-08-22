# Bài 03 — Polymorphic Payroll

**Độ khó:** Very Hard
**Mục tiêu:** Thiết kế hierarchy worker có abstract class, override, constructor chaining, strategy, factory và xử lý toàn bộ collection qua base reference.

## Bối cảnh

Một công ty có nhiều loại worker. Mọi worker đều có tên và mã, nhưng cách tính thu nhập khác nhau.

Các loại bắt buộc:

- Monthly employee
- Hourly employee
- Commission employee
- Contractor

## Abstract base

Tạo abstract class Worker có:

- worker id
- worker code
- tên
- ngày hoặc tháng bắt đầu, nếu cần
- method đọc thông tin chung
- abstract role()
- abstract grossPay()
- method label() dùng behavior chung

Yêu cầu:

- Field chung phải private hoặc protected có lý do rõ ràng.
- Constructor base validate code và name.
- Subclass phải gọi super(...).
- Base class không được biết cụ thể mọi subclass.
- Không để base class chứa if type == MONTHLY hoặc if type == HOURLY để tính lương.

## Các worker

### Monthly employee

- Có monthly salary.
- Gross pay bằng salary.
- Salary không âm.

### Hourly employee

- Có hours và hourly rate.
- Gross pay bằng hours × hourlyRate.
- Hours và rate không âm.

### Commission employee

- Có base salary.
- Có doanh thu.
- Có commission percent.
- Gross pay bằng baseSalary + revenue × percent / 100.
- Commission percent nằm trong khoảng 0 đến 100.

### Contractor

- Có contract amount.
- Có retention percent.
- Net pay bằng contractAmount - retention.

## Polymorphism

Payroll service phải nhận:

- List<Worker> hoặc abstraction tương đương.
- Không được yêu cầu caller cast từng worker.
- Khi gọi grossPay() trên base reference, implementation runtime phải được dispatch tới subclass tương ứng.

Tổng payroll phải được tính bằng một vòng lặp dùng kiểu Worker.

Không chấp nhận thiết kế dạng:

~~~
if worker is Monthly then ...
else if worker is Hourly then ...
else if worker is Contractor then ...
~~~

cho common payroll calculation.

## Overload và override

Bắt buộc có ít nhất một overload hợp lý, ví dụ:

- tìm worker bằng WorkerCode
- tìm worker bằng String

Override phải có @Override.

Không được dùng return type khác nhau để tạo overload.

## Payroll policy strategy

Tạo interface PayrollPolicy hoặc DeductionPolicy.

Implementation tối thiểu:

- No deduction
- Fixed deduction
- Percentage deduction
- Tax cap policy

Payroll service nhận policy qua constructor hoặc method injection.

Cùng một danh sách worker nhưng policy khác nhau phải tạo total khác nhau mà không sửa worker class.

## Worker factory

Tạo factory nhận loại worker và dữ liệu tương ứng:

~~~
MONTHLY
HOURLY
COMMISSION
CONTRACTOR
~~~

Factory phải trả về Worker, không trả về implementation cụ thể trong API của consumer.

Input type không hợp lệ phải trả failure rõ ràng hoặc ném exception domain phù hợp.

## Value object và Object contract

Tạo WorkerCode immutable.

Yêu cầu:

- Normalize uppercase.
- Reject blank.
- Hai code cùng giá trị logic phải bằng nhau.
- hashCode() nhất quán.

Worker có thể equality theo WorkerCode, nhưng phải ghi rõ trong requirement/test. Không được vô tình dùng object identity nếu domain yêu cầu logical identity.

toString() phải phục vụ debug/report và không được chứa dữ liệu nhạy cảm không cần thiết.

## Payroll report

Report phải chứa:

- số worker
- gross total
- deduction total
- net total
- từng dòng worker theo thứ tự input

Format phải deterministic. Không phụ thuộc thứ tự của hash collection.

## Acceptance criteria

- Có abstract base class.
- Có ít nhất bốn subclass final.
- Common calculation dùng polymorphism.
- Có constructor chaining bằng super(...).
- Có ít nhất một overload và nhiều override.
- Có strategy policy được inject.
- Có factory tạo worker.
- Không có business logic type-switch trong payroll loop.
- Có test zero hours, zero commission, 100% commission, invalid negative input.
- Có test base reference trỏ tới từng subclass.
- Có test equals/hashCode của worker code.

## Bonus

- Thêm capability interface Exportable cho worker có thể xuất hóa đơn.
- Thêm capability Taxable nhưng không ép mọi worker phải implement.
- Thêm PayrollView record và mapper.
- Thêm fake clock để tính thâm niên mà không phụ thuộc thời gian thật.
