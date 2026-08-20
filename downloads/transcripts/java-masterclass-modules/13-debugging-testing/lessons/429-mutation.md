# 429 — Mutation mindset

Hỏi “nếu đổi `>` thành `>=`, bỏ validation hoặc nuốt exception, test có fail không?”. Đây là tư duy mutation: test phải kill thay đổi làm behavior sai.

Không cần tool mutation để bắt đầu; review manually các mutation ở branch/invariant quan trọng.
