# Lời giải — Qualified export

Ưu tiên unqualified export, sau đó tra allow-list exact theo package. `null` không được coi là wildcard để tránh vô tình mở boundary. Độ phức tạp O(1) trung bình.

