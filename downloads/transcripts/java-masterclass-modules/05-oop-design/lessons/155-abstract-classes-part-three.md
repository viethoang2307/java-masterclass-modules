# 155 — Abstract Classes Part 3

## Mục tiêu

Thiết kế hierarchy mở rộng được và nhận diện recursion/base case khi cần.

## Mental model

Abstraction cần termination nếu method recursive; subtype behavior không được phá invariants của base.

## Ví dụ Java 17

~~~java
`static int sum(int[] xs,int i){return i==xs.length?0:xs[i]+sum(xs,i+1);}`
~~~

## Lỗi thường gặp

- Recursion không base case.
- Hierarchy quá sâu.
- Abstract method contract không document.

## Bài tập ngắn

Viết recursive tree/price exercise rồi refactor iterative comparison.

## Interview prompt

Khi nào recursion làm design khó kiểm chứng?

## Nguồn

Transcript course lesson 155; ví dụ được chuẩn hóa theo Java 17 và diễn giải theo hướng OOP design.

