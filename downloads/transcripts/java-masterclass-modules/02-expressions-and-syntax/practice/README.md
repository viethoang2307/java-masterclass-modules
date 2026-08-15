# Practice — Module 02 — Expressions và Syntax

Bộ practice gồm 20 bài tăng dần từ Medium đến Extreme. Toàn bộ bộ bài kết hợp lại phủ các concept trong module.

## Quy ước

- code/: starter code, đề bài, TODO và self-check để người học tự làm.
- solutions/: lời giải hoàn chỉnh, hướng tư duy, pitfalls và complexity.
- Các bài Java đều có self-check executable.
- Không dùng Maven, Gradle hoặc JUnit.
- Compile theo Java 17 bằng javac --release 17.

## Mức độ

- 01–05: Medium
- 06–12: Hard
- 13–17: Very Hard
- 18–20: Extreme

## Mục lục

| # | Bài | Độ khó | Coverage | Thư mục |
|---:|---|---|---|---|
| 01 | main và Output Contract | Medium | main, statement, String | [code](code/ex01-main-output-contract) / [solution](solutions/ex01-main-output-contract) |
| 02 | Declaration, initialization và assignment | Medium | variables, assignment | [code](code/ex02-assignment-state) / [solution](solutions/ex02-assignment-state) |
| 03 | Precedence và parentheses | Medium | expression grouping | [code](code/ex03-precedence-parentheses) / [solution](solutions/ex03-precedence-parentheses) |
| 04 | Integer division và remainder | Medium | int arithmetic | [code](code/ex04-integer-division-remainder) / [solution](solutions/ex04-integer-division-remainder) |
| 05 | Primitive range và wrapper constants | Medium | primitive/wrapper ranges | [code](code/ex05-primitive-range-wrappers) / [solution](solutions/ex05-primitive-range-wrappers) |
| 06 | Numeric literal và suffix | Hard | long, float, double literals | [code](code/ex06-literal-suffixes) / [solution](solutions/ex06-literal-suffixes) |
| 07 | Promotion của byte và short | Hard | numeric promotion | [code](code/ex07-numeric-promotion) / [solution](solutions/ex07-numeric-promotion) |
| 08 | Widening và narrowing cast | Hard | conversion and data loss | [code](code/ex08-widening-narrowing-cast) / [solution](solutions/ex08-widening-narrowing-cast) |
| 09 | Overflow và underflow forensic | Hard | integer overflow | [code](code/ex09-integer-overflow) / [solution](solutions/ex09-integer-overflow) |
| 10 | char, escape và UTF-16 code unit | Hard | char and Unicode | [code](code/ex10-char-escape-code-unit) / [solution](solutions/ex10-char-escape-code-unit) |
| 11 | Boolean expressions và truth table | Hard | boolean logic | [code](code/ex11-boolean-decision) / [solution](solutions/ex11-boolean-decision) |
| 12 | String concatenation, equality và immutability | Hard | String semantics | [code](code/ex12-string-equality-immutability) / [solution](solutions/ex12-string-equality-immutability) |
| 13 | Compile-error repair pack | Very Hard | compiler-first debugging | [code](code/ex13-compile-error-repair) / [solution](solutions/ex13-compile-error-repair) |
| 14 | Type-prediction gauntlet | Very Hard | expression type and order | [code](code/ex14-type-prediction-gauntlet) / [solution](solutions/ex14-type-prediction-gauntlet) |
| 15 | Floating-point precision và epsilon | Very Hard | double and Math.abs | [code](code/ex15-floating-point-epsilon) / [solution](solutions/ex15-floating-point-epsilon) |
| 16 | So sánh double với BigDecimal | Very Hard | decimal exactness | [code](code/ex16-bigdecimal-money) / [solution](solutions/ex16-bigdecimal-money) |
| 17 | Expression report với args, String và primitives | Very Hard | main args and concatenation | [code](code/ex17-args-string-report) / [solution](solutions/ex17-args-string-report) |
| 18 | Numeric-conversion forensic lab | Extreme | promotion/cast/overflow | [code](code/ex18-numeric-conversion-forensics) / [solution](solutions/ex18-numeric-conversion-forensics) |
| 19 | Invoice calculation với precision control | Extreme | BigDecimal and scale | [code](code/ex19-invoice-precision) / [solution](solutions/ex19-invoice-precision) |
| 20 | Capstone Expression & Type Audit | Extreme | full syntax/type audit | [code](code/ex20-expression-type-audit) / [solution](solutions/ex20-expression-type-audit) |

## Chạy một bài

~~~powershell
cd code/ex01-ten-bai
javac --release 17 Main.java SelfCheck.java
java SelfCheck
~~~

Starter có thể FAIL hoặc chưa compile ở bài được đánh dấu compile-error repair. Lời giải phải in PASS.

## Chạy toàn bộ lời giải

~~~powershell
./verify-solutions.ps1
~~~

## Cách học

1. Đọc README trong code trước.
2. Viết dự đoán output hoặc evidence plan.
3. Làm bài mà không mở solutions.
4. Chạy SelfCheck.
5. Chỉ sau đó đọc solutions và ghi lại điều mình đã bỏ sót.

