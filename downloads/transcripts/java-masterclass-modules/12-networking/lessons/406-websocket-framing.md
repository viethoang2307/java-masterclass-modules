# 406 — WebSocket framing

Frame có FIN, opcode, mask, payload length và fragmentation. Client-to-server frames phải mask theo protocol; message có thể trải qua nhiều frame.

Parser state machine phải reject invalid opcode/length, accumulate fragmented payload bounded và xử lý close code. Không coi mỗi frame là message.
