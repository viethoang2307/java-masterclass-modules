# Lời giải 18 — Immutable Catalog

Constructor là trust boundary: normalize và copy từng product thay vì chỉ copy outer collection. Primary index là SKU→Product; secondary index tag→list product được freeze sau khi sort. Lỗi thường gặp là record trông immutable nhưng vẫn giữ reference tới mutable set. Build O(n×t + sorting); lookup SKU O(1) average, tag O(1) average cộng kích thước kết quả. Nếu catalog thay đổi thường xuyên, cần aggregate mutable kiểm soát cả hai index thay vì object immutable này.
