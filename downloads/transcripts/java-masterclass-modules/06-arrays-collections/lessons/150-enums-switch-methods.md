# 150. Enum, switch và methods

## Switch expression

~~~java
static int weight(Priority priority) {
    return switch (priority) {
        case LOW -> 1;
        case MEDIUM -> 2;
        case HIGH -> 3;
    };
}
~~~

Switch expression trả value và compiler có thể kiểm tra exhaustive với enum. Null vẫn gây NullPointerException nếu không xử lý trước.

## Behavior nằm ở đâu?

Nếu label/weight gắn chặt với enum, đặt method trong enum. Nếu policy thay đổi theo configuration/user, dùng service/strategy thay vì hard-code mọi thứ vào enum.

## Bài tập

Implement task scheduler sort theo priority weight giảm, name tăng. Test tie-breaker, null priority, parse case và immutable result.

## Checkpoint

Enum là closed set tốt cho state/role/category; không nên biến thành nơi chứa toàn bộ business system.
