# 521 — CI và reproducibility

CI phải kiểm tra cùng contract mà người học chạy local:

```text
clean -> compile --release 17 -> unit -> integration -> package -> smoke -> report
```

Pin JDK distribution/version, locale/timezone nếu ảnh hưởng output, dependency checksum và test data. Không để test phụ thuộc working directory, local database hoặc internet không kiểm soát.

## Failure artifact

Upload compiler output, test report, logs, packaged descriptor và command manifest. Fail fast ở compile; cleanup temp files trong finally.

## Branch/commit

Commit nhỏ theo feature giúp bisect; commit capstone nên có README acceptance evidence. Không commit generated `.class`, secret hoặc database file local.

## Checkpoint

Thiết kế pipeline chạy được trên Windows và Unix, nêu khác biệt path separator, shell quoting và executable launcher.

