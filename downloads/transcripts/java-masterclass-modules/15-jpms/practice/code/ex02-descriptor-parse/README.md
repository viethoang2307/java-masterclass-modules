# Bài 02 — Parse descriptor (Medium)

Cho một chuỗi `module-info.java`. Trả về tập module trong `requires`, bỏ qua `transitive`/`static`, và tập package trong `exports`, kể cả qualified export trước `to`.

Giữ thứ tự xuất hiện nếu có thể. Không coi comment hoặc chuỗi trong code là directive; phạm vi bài là descriptor hợp lệ với mỗi directive trên một dòng.

