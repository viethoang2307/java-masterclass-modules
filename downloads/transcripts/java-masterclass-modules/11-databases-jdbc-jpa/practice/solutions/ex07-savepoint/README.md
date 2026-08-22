# Lời giải Bài 07

`beforeOptional` là state sau core. Failure optional chỉ rollback tới state đó, không rollback toàn transaction. JDBC dùng `Savepoint` và `rollback(savepoint)`; nếu core fail thì rollback toàn bộ.
