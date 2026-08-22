# Bài 02 — Value-object validation (Medium)

`normalizeArtist` trim một tên artist, trả string sạch khi hợp lệ, và throw `IllegalArgumentException` nếu null, blank hoặc dài hơn 120 ký tự. Không để UI là nơi duy nhất validate.

Test cả whitespace đầu/cuối, Unicode và giới hạn 120/121.

