# 517 — Security review: input và secrets

Boundary nhận dữ liệu không tin cậy: command line, file, HTTP, database và UI. Validate size/format trước khi parse sâu; dùng parameterized SQL và encode output đúng context.

Secrets không commit vào source/README/log. Dùng environment/secret store/config injection; redaction phải được test. Không coi module encapsulation là security boundary thay cho authentication/authorization.

## Threat checklist

- path traversal khi user chọn file;
- CSV/JSON bomb hoặc file quá lớn;
- SSRF nếu URL cấu hình từ input;
- SQL injection;
- insecure temp file/permissions;
- sensitive data trong exception message.

## Checkpoint

Threat-model import file và remote artwork URL: asset, attacker, boundary, mitigation, test evidence.

