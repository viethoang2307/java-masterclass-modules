# Practice — Module 03 — Control Flow, Methods và Input

Bộ 20 bài tăng dần từ Medium đến Extreme. Tổng thể bao phủ expressions, branching, methods, overloads, loops, parsing và console input.

## Quy ước

- code/: đề bài, starter code có TODO, input/output mẫu và tiêu chí hoàn thành.
- solutions/: lời giải đầy đủ, explanation, pitfalls và complexity.
- Mỗi exercise compile riêng vì mỗi thư mục có Main và SelfCheck riêng.
- Java 17, javac --release 17, không Maven/Gradle/JUnit.
- Bài input dùng pure helper hoặc String-backed Scanner để self-check deterministic; có thể mở rộng thành CLI tương tác.

## Mức độ

- 01–05: Medium
- 06–12: Hard
- 13–17: Very Hard
- 18–20: Extreme

## Mục lục

| # | Bài | Độ khó | Coverage | Thư mục |
|---:|---|---|---|---|
| 01 | Score classifier bằng if/else | Medium | conditions, boundaries | [code](code/ex01-score-classifier) / [solution](solutions/ex01-score-classifier) |
| 02 | Eligibility với logical operators | Medium | &&, ||, short-circuit | [code](code/ex02-eligibility-logic) / [solution](solutions/ex02-eligibility-logic) |
| 03 | Ternary formatter | Medium | ternary, String output | [code](code/ex03-ternary-formatter) / [solution](solutions/ex03-ternary-formatter) |
| 04 | Method-based temperature report | Medium | methods, return values | [code](code/ex04-method-report) / [solution](solutions/ex04-method-report) |
| 05 | High-score position | Medium | if/else chain, method contract | [code](code/ex05-high-score-position) / [solution](solutions/ex05-high-score-position) |
| 06 | Day-of-week switch | Hard | switch, default | [code](code/ex06-day-of-week-switch) / [solution](solutions/ex06-day-of-week-switch) |
| 07 | Sum range với for | Hard | for, accumulator | [code](code/ex07-sum-range-for) / [solution](solutions/ex07-sum-range-for) |
| 08 | Sum multiples 3 hoặc 5 | Hard | modulo, OR, overflow awareness | [code](code/ex08-sum-multiples) / [solution](solutions/ex08-sum-multiples) |
| 09 | while/do-while menu | Hard | loop choice, break | [code](code/ex09-menu-loop) / [solution](solutions/ex09-menu-loop) |
| 10 | Digit sum và reverse | Hard | %, /, loops | [code](code/ex10-digit-operations) / [solution](solutions/ex10-digit-operations) |
| 11 | Duration overloads | Hard | overloading, quotient/remainder | [code](code/ex11-duration-overloads) / [solution](solutions/ex11-duration-overloads) |
| 12 | Prime/range challenge | Hard | methods, nested decisions | [code](code/ex12-prime-range) / [solution](solutions/ex12-prime-range) |
| 13 | String parser | Very Hard | parseInt, validation | [code](code/ex13-string-parser) / [solution](solutions/ex13-string-parser) |
| 14 | Scanner token recovery | Very Hard | Scanner, invalid token, EOF | [code](code/ex14-scanner-recovery) / [solution](solutions/ex14-scanner-recovery) |
| 15 | Read 10 valid integers | Very Hard | valid quota, input state | [code](code/ex15-ten-valid-integers) / [solution](solutions/ex15-ten-valid-integers) |
| 16 | Min/max streaming input | Very Hard | sentinel, invariants | [code](code/ex16-min-max-input) / [solution](solutions/ex16-min-max-input) |
| 17 | Boundary test harness | Very Hard | self-check design, regression | [code](code/ex17-boundary-harness) / [solution](solutions/ex17-boundary-harness) |
| 18 | CLI menu state machine | Extreme | switch + loop + methods | [code](code/ex18-cli-state-machine) / [solution](solutions/ex18-cli-state-machine) |
| 19 | Robust input statistics | Extreme | parsing, loops, min/max/avg | [code](code/ex19-input-statistics) / [solution](solutions/ex19-input-statistics) |
| 20 | Control Flow & Input Capstone | Extreme | integrated module audit | [code](code/ex20-control-flow-input-audit) / [solution](solutions/ex20-control-flow-input-audit) |

## Chạy một bài

~~~powershell
cd code/ex01-score-classifier
javac --release 17 Main.java SelfCheck.java
java SelfCheck
~~~

Lời giải thành công phải in PASS. Starter giữ TODO để người học làm trước; bài nào cố ý không compile sẽ được đánh dấu rõ trong README của bài.

## Chạy toàn bộ lời giải

~~~powershell
./verify-solutions.ps1
~~~

