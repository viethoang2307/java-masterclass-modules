# Lesson 002 — Remaster và Java 17

## Khái niệm

Remaster là bản cập nhật nội dung course từ Java 8 lên Java 17, kèm slide và sửa lỗi giải thích. Đây là baseline học tập của archive hiện tại.

## Vì sao version quan trọng?

Java thay đổi theo feature release. Một feature có thể:

- chưa tồn tại ở version cũ;
- tồn tại nhưng là preview;
- đổi API/tooling;
- yêu cầu dependency ngoài như JavaFX;
- compile được trên JDK mới nhưng không chạy trên runtime cũ.

Vì vậy “Java là Java” không đủ chính xác khi setup project.

## JDK 17 trong course

JDK 17 là Long-Term Support baseline phù hợp để học vì:

- course remaster viết và kiểm tra theo version này;
- nhiều API nền tảng ổn định;
- syntax hiện đại hơn Java 8 nhưng chưa kéo theo toàn bộ thay đổi mới nhất;
- dependency/framework phổ biến có compatibility tốt.

## Course và hiện tại

Nội dung course là nguồn chính cho mental model Java 17. Khi code production, phải kiểm tra version project đang target, compiler release, runtime image, build plugin và dependency.

**Bổ sung ngoài course:** JDK mới hơn có thể bổ sung virtual threads, API HTTP mới và language feature khác. Không tự động đưa feature mới vào bài Java 17 nếu chưa ghi rõ source/target requirement.

## Workflow version an toàn

    project target = 17
        -> compile với --release 17
        -> test trên JDK 17
        -> CI kiểm tra runtime/dependency
        -> upgrade có migration note

Dùng một version trong learning path giúp giảm noise. Upgrade là một task có kiểm thử, không phải đổi số trong IDE.

## Pitfalls

- Dùng JDK 22/26 rồi nghĩ code chắc chắn tương thích ngược.
- Dùng API mới hơn target release.
- Chỉ kiểm tra compile, không kiểm tra runtime.
- Copy code từ bài legacy mà không ghi chú version.

## Interview prompts

1. Vì sao course chọn JDK 17 thay vì version mới nhất?
2. target release và JDK cài trên máy khác nhau thế nào?
3. Khi nâng Java version, bạn kiểm tra những gì?

## Practice

Tạo bảng compatibility cho project học:

| Thành phần | Version |
|---|---|
| JDK | 17 |
| target release | 17 |
| build tool | ghi version |
| test framework | ghi version |
| JavaFX nếu dùng | ghi version tương thích |

Sau đó viết một note migration giả định từ 17 lên version mới hơn: API nào cần kiểm tra, test nào cần chạy, dependency nào có rủi ro.

## Kết luận

Java version là một phần của contract build/runtime. Học theo Java 17 giúp archive nhất quán; cập nhật version phải có kiểm chứng và ghi chú.

## Nguồn

Transcript: 002 - 1 Getting Started with Java Programming - Course Remastered.
