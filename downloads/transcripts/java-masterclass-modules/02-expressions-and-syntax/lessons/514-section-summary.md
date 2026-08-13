# 514 — First Steps summary

## Bản đồ kiến thức

~~~mermaid
mindmap
  root((First Steps))
    Class và main
    Keywords
    Variables
      declaration
      initialization
      reassignment
    Expressions
      precedence
      arithmetic
      assignment
    Primitive types
      integer
      floating point
      char
      boolean
    String
      concatenation
      equals
      immutable
~~~

## Tự kiểm tra

1. Vì sao 5 / 2 là 2 nhưng 5.0 / 2 là 2.5?
2. Vì sao byte + short thành int?
3. Khi nào cần L, f?
4. Vì sao a.equals(b) khác a == b với String?
5. Lỗi nào compile-time, lỗi nào runtime?

Nếu chưa trả lời được, quay lại lesson tương ứng và tạo một snippet nhỏ thay vì đọc lại thụ động.

## Mini-project

Viết InvoiceSummary với:

- String customerName;
- int itemCount;
- double subtotal;
- boolean paid;
- output gồm tên, số lượng, tổng tiền và trạng thái.

Sau đó ghi chú vì sao production code có thể chọn BigDecimal thay double cho tiền.

## Nguồn

- Transcript course: lesson 514.
- Oracle Language Basics.

