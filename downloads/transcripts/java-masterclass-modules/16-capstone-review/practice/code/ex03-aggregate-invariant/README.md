# Bài 03 — Immutable aggregate (Medium)

`addTrack` trả list mới không thể mutate từ bên ngoài. Reject track null, ID/title blank và duplicate ID; input list null được coi là empty. Không sửa list gốc.

SelfCheck sẽ thử mutate output để đảm bảo snapshot immutable.

