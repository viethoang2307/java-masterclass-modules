# 405 — WebSocket concepts

WebSocket bắt đầu bằng HTTP Upgrade rồi thành kênh hai chiều persistent. Có text/binary message, ping/pong keepalive và close handshake.

Server cần validate origin/auth, giới hạn message size và xử lý back-pressure. TCP connection sống không đồng nghĩa peer khỏe; heartbeat và idle timeout cần có.
