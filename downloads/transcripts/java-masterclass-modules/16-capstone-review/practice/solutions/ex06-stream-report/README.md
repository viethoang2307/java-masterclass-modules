# Lời giải — Stream report

Pipeline filter null/blank, normalize artist rồi grouping vào `TreeMap` để iteration deterministic. Stream chỉ tạo read model, không thực hiện side effect. Độ phức tạp O(n log k) do map có thứ tự.

