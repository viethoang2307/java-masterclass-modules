# 425 — Regression test

Mỗi bug production nên có input tối thiểu tái hiện, expected behavior và test giữ lại sau fix. Test fail trước fix là evidence reproducer; test pass sau fix là regression gate.

Không encode workaround vào expected nếu contract chưa được quyết định.
