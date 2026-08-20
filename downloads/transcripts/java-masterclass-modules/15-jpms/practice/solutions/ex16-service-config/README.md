# Lời giải — Service configuration

Kiểm tra `uses` bằng regex có quote service name, sau đó kiểm tra từng provider theo chuỗi directive. Lỗi được thêm theo thứ tự contract: uses trước, provider sau; điều này làm report ổn định.

