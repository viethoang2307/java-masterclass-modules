# Lời giải Bài 14

Opcode là protocol control, không coi mọi frame là message. Fragmentation/FIN và payload limit cần parser state riêng; opcode unknown phải close protocol error.
