# 525 — Demo, handoff và postmortem

Demo theo một flow có dữ liệu chuẩn bị và một flow lỗi. Hiển thị command, logs/evidence, cancellation và recovery; đừng phụ thuộc thao tác ngẫu hứng.

## Handoff pack

- README/runbook;
- architecture/module diagram;
- schema/format version;
- test and smoke output;
- config example không chứa secret;
- known limitations và rollback;
- contact/ownership cho dependency.

## Postmortem

Ghi timeline, impact, detection, root cause, contributing factors và action items có owner/due date. Không đổ lỗi cá nhân. Một bug “UI update sai thread” nên dẫn tới invariant/test/tooling cải thiện, không chỉ patch một dòng.

## Completion gate

Capstone hoàn thành khi người khác clone/clean build/chạy được, tests pass, artifact mô tả được, và reviewer hiểu các trade-off. Đây là tiêu chuẩn của toàn khóa, không phải chỉ một screenshot.

