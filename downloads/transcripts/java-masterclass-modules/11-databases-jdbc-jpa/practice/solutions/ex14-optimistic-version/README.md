# Lời giải Bài 14

Version check và update phải là một SQL statement atomic: `where id=? and version=?`, sau đó kiểm row count. Code mô phỏng row hiện có version 1; stale writer không được overwrite.
