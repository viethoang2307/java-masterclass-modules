# Lời giải Bài 10

SQLState được map theo code contract minh họa: `23505` duplicate, `40001` serialization/transient, `28000` authorization. Mapper giữ cause gốc ở exception thật; retry chỉ cho nhóm transient với budget.
