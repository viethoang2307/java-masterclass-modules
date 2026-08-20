# Lời giải Bài 19

Outbox record được commit cùng business state. Publish là bước sau commit; nếu fail, worker retry pending record. Không gọi publish trong transaction rồi giả định rollback được message đã gửi.
