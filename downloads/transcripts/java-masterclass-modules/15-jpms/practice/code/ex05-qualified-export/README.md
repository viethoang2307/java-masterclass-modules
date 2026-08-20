# Bài 05 — Qualified export (Medium)

`openExports` chứa package export cho mọi module; `qualifiedExports` map package tới các requester được phép. Trả về true nếu package được export unqualified hoặc requester nằm trong allow-list.

Không coi `null` requester là wildcard. Đây là bài boundary, chưa xét reflection/opens.

