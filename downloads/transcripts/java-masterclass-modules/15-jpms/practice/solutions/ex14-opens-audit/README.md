# Lời giải — Reflection/opens audit

Regex nhận package và allow-list sau `to`. Không có allow-list nghĩa là unqualified `opens`, còn có allow-list thì phải match target exact. `exports` được bỏ qua vì không cấp deep reflection.

