# Lời giải — Command normalization

`isBlank` bắt cả whitespace Unicode cơ bản; `trim` bỏ biên và regex gom whitespace ở giữa. Payload không bị đổi case. Độ phức tạp O(n), với n là độ dài command.

