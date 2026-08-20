# Practice — Module 09: Regex, Exceptions và I/O

Mỗi bài có starter trong code/ và lời giải trong solutions/. Các bài file system dùng temp directory và cleanup trong SelfCheck.

| Bài | Chủ đề | Độ khó | Kiến thức phủ |
|---:|---|---|---|
| 01 | Username Regex Validator | Medium | Pattern, matches, character class |
| 02 | Regex Token Extractor | Medium | Matcher.find, group, offsets |
| 03 | Named Group Date Parser | Medium | groups, LocalDate semantic validation |
| 04 | Regex Redaction | Medium | replaceAll, capture groups |
| 05 | Custom Format Exception | Medium | checked exception, cause |
| 06 | Multi-catch Config Parser | Hard | multi-catch, input grammar |
| 07 | Try-with-resources Line Count | Hard | Files.lines, resource ownership |
| 08 | Safe Path Resolve | Hard | normalize, path traversal |
| 09 | UTF-8 Error Counter | Hard | explicit charset, streaming |
| 10 | Atomic Text Write | Hard | temp file, move, cleanup |
| 11 | Buffered Record Reader | Hard | BufferedReader, line context |
| 12 | Scanner Token Parser | Hard | Scanner, delimiter, EOF |
| 13 | Strict UTF-8 Decoder | Very Hard | CharsetDecoder, REPORT |
| 14 | Files Write Modes | Very Hard | OpenOption, create/append/replace |
| 15 | Binary Data Round-trip | Very Hard | Data streams, EOF |
| 16 | Binary Copy with Buffer | Very Hard | partial reads, byte integrity |
| 17 | Safe Serialization Snapshot | Extreme | Serializable, transient, validation |
| 18 | Random Access Score | Extreme | fixed-width offset, seek |
| 19 | File Tree Delete | Extreme | FileVisitor, post-order cleanup |
| 20 | Log File Processor Capstone | Extreme | Regex + UTF-8 + grouping + errors |

## Chạy một bài

~~~powershell
cd solutions/ex01-username-regex
javac --release 17 Main.java SelfCheck.java
java SelfCheck
~~~

## Chạy toàn bộ solutions

~~~powershell
powershell.exe -ExecutionPolicy Bypass -File .\verify-solutions.ps1
~~~

Kết quả đúng phải có Summary: PASS=20 FAIL=0.

