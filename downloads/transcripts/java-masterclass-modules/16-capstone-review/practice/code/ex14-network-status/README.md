# Bài 14 — Network status policy (Hard)

Phân loại 2xx thành `success`; 408/429/5xx thành `retryable`; 4xx còn lại thành `client-error`; status khác thành `unknown`. Mapping này là policy đầu vào cho retry/error boundary.

Không retry 401/403/422 chỉ vì chúng là HTTP error.

