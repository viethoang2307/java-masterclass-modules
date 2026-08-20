# Bài 04 — Strategy selection (Medium)

Chọn strategy đúng ID, available và priority cao nhất. Trả `null` nếu không có. Khi hòa priority, giữ strategy xuất hiện đầu tiên.

Mục tiêu là tách selection policy khỏi implementation cụ thể; không hard-code `if (id.equals("csv"))` cho từng loại.

