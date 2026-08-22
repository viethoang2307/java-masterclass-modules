# Lời giải Bài 18

Node mutation phải trên Application Thread; file/network/CPU ở Task/Service. Boundary này giúp tránh UI freeze và thread violation.
