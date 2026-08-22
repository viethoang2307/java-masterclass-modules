# Lời giải — Modular JAR audit

Phân biệt ba trạng thái: không có descriptor (`not-modular`), descriptor sai tên (`wrong-module`) và export thiếu package trong artifact. Matcher duyệt descriptor một lần cho module và một lần cho exports; report giữ thứ tự evidence.

