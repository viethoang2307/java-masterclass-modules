# Module 11 — Databases, JDBC và JPA

Module này nối SQL với Java ở hai tầng: JDBC cho control rõ ràng trên connection, statement, result set và transaction; JPA cho object-relational mapping, entity lifecycle và abstraction cao hơn. Practice không yêu cầu database server hay dependency ngoài, nên tập trung vào contract, SQL safety, transaction state và repository boundary; lesson vẫn có ví dụ JDBC/JPA dùng trong project thật.

## Kết quả học tập

- hiểu RDBMS, schema, table, key, constraint, DDL/DML và transaction;
- cấu hình `DriverManager`, `DataSource`, `Connection`, `Statement`, `PreparedStatement`, `ResultSet`;
- map row thành domain object, xử lý null/numeric type và đóng resource;
- chống SQL injection bằng parameter binding, whitelist identifier và least privilege;
- dùng commit/rollback, savepoint, isolation, batch update và generated keys;
- gọi stored procedure/function bằng `CallableStatement` với IN/OUT parameter;
- thiết kế repository/service tách domain khỏi JDBC;
- giải thích entity lifecycle, persistence context, JPQL, lazy/eager, cascade và N+1 trong JPA;
- chọn transaction boundary và viết migration/test strategy có thể tái lập.

## Lộ trình lesson

| Bài | Trọng tâm |
|---|---|
| 353–357 | relational model, SQL, schema và JDBC architecture |
| 358–363 | connection, statement, query, ResultSet, mapping và injection |
| 364–370 | DML, generated keys, transaction, rollback, batch và isolation |
| 371–376 | CallableStatement, stored procedure, repository và ORM/JPA |
| 377–382 | entity lifecycle, mappings, JPQL, fetch plan và N+1 |
| 383–387 | pool, migrations, testing, security và capstone |

## Practice

20 bài chạy bằng Java 17, không Maven/Gradle/JUnit và không yêu cầu database server. Bài SQL contract hoặc fake JDBC boundary ghi rõ giới hạn; không giả tạo việc kết nối DB trong self-check.

```powershell
powershell -ExecutionPolicy Bypass -File .\practice\verify-solutions.ps1
```

Mỗi bài compile riêng bằng `javac --release 17 Main.java SelfCheck.java`; thành công phải in `PASS`. Xem [practice overview](practice/README.md) và [index lesson](INDEX.md).

## Nguyên tắc production

1. Resource JDBC phải nằm trong try-with-resources.
2. User input chỉ đi qua parameter binding; identifier phải whitelist.
3. Transaction boundary nằm ở service/use case, không rải commit trong repository.
4. Không trả `ResultSet` ra ngoài connection scope.
5. JPA không loại bỏ SQL: phải quan sát query, fetch plan và transaction.
