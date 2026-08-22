# Lời giải — `jdeps` classification

Public API phải truyền readability cho consumer nên ưu tiên `requires transitive`. Dependency chỉ dùng lúc chạy là `requires`; annotation/compiler-only là `requires static`. Decision table chạy trong O(1).

