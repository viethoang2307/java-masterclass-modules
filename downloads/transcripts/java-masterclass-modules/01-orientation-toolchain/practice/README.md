# Practice — Module 01 — Orientation và Toolchain

Bộ practice gồm 20 bài tăng dần từ Medium đến Extreme. Toàn bộ bộ bài kết hợp lại phủ các concept trong module.

## Quy ước

- code/: starter code, đề bài, TODO và self-check để người học tự làm.
- solutions/: lời giải hoàn chỉnh, hướng tư duy, pitfalls và complexity.
- Module này có bài hybrid: evidence-template.md yêu cầu thu thập output thật từ máy, IDE hoặc JShell.
- Không dùng Maven, Gradle hoặc JUnit.
- Compile theo Java 17 bằng javac --release 17.

## Mức độ

- 01–05: Medium
- 06–12: Hard
- 13–17: Very Hard
- 18–20: Extreme

## Mục lục

| # | Bài | Độ khó | Coverage | Thư mục |
|---:|---|---|---|---|
| 01 | Audit JDK, JVM và JRE | Medium | JDK/JVM/JRE | [code](code/ex01-jdk-jvm-jre-audit) / [solution](solutions/ex01-jdk-jvm-jre-audit) |
| 02 | Đối chiếu java và javac | Medium | version alignment, PATH | [code](code/ex02-java-javac-alignment) / [solution](solutions/ex02-java-javac-alignment) |
| 03 | Quản lý state trong JShell | Medium | JShell state commands | [code](code/ex03-jshell-state-lab) / [solution](solutions/ex03-jshell-state-lab) |
| 04 | Compile và chạy Hello World bằng CLI | Medium | javac, bytecode, launcher | [code](code/ex04-cli-hello-world) / [solution](solutions/ex04-cli-hello-world) |
| 05 | Đối chiếu IDE và terminal | Medium | IDE/CLI parity | [code](code/ex05-ide-cli-parity) / [solution](solutions/ex05-ide-cli-parity) |
| 06 | Kiểm tra tương thích Java 17 | Hard | --release, compatibility | [code](code/ex06-java17-release-compatibility) / [solution](solutions/ex06-java17-release-compatibility) |
| 07 | Chẩn đoán PATH và JAVA_HOME | Hard | executable resolution | [code](code/ex07-path-java-home-diagnosis) / [solution](solutions/ex07-path-java-home-diagnosis) |
| 08 | Sửa Project SDK và Run Configuration | Hard | IntelliJ SDK | [code](code/ex08-project-sdk-run-config) / [solution](solutions/ex08-project-sdk-run-config) |
| 09 | Checklist setup tái lập | Hard | verification workflow | [code](code/ex09-reproducible-setup-checklist) / [solution](solutions/ex09-reproducible-setup-checklist) |
| 10 | Chọn JDK/LTS theo tình huống | Hard | LTS and compatibility | [code](code/ex10-jdk-lts-selection) / [solution](solutions/ex10-jdk-lts-selection) |
| 11 | Thiết kế study loop từ video tới code | Hard | active learning | [code](code/ex11-video-to-code-study-loop) / [solution](solutions/ex11-video-to-code-study-loop) |
| 12 | Chuẩn hóa thuật ngữ từ subtitle | Hard | technical listening | [code](code/ex12-subtitle-terminology) / [solution](solutions/ex12-subtitle-terminology) |
| 13 | Tạo Minimal Reproducible Example | Very Hard | MRE and evidence | [code](code/ex13-minimal-reproducible-example) / [solution](solutions/ex13-minimal-reproducible-example) |
| 14 | Cải thiện câu hỏi kỹ thuật | Very Hard | Q&A quality | [code](code/ex14-technical-question-rewrite) / [solution](solutions/ex14-technical-question-rewrite) |
| 15 | Lập Compiler Error Triage Log | Very Hard | compiler diagnostics | [code](code/ex15-compiler-error-triage) / [solution](solutions/ex15-compiler-error-triage) |
| 16 | Điều tra xung đột hai JDK | Very Hard | multiple JDKs | [code](code/ex16-dual-jdk-forensics) / [solution](solutions/ex16-dual-jdk-forensics) |
| 17 | Runbook setup đa nền tảng | Very Hard | OS-specific workflow | [code](code/ex17-cross-platform-runbook) / [solution](solutions/ex17-cross-platform-runbook) |
| 18 | Incident môi trường Java bị hỏng | Extreme | incident response | [code](code/ex18-broken-environment-incident) / [solution](solutions/ex18-broken-environment-incident) |
| 19 | Mô phỏng onboarding máy sạch | Extreme | reproducibility | [code](code/ex19-clean-machine-onboarding) / [solution](solutions/ex19-clean-machine-onboarding) |
| 20 | Capstone Environment Evidence Pack | Extreme | full toolchain handoff | [code](code/ex20-environment-evidence-capstone) / [solution](solutions/ex20-environment-evidence-capstone) |

## Chạy một bài

~~~powershell
cd code/ex01-ten-bai
javac --release 17 Main.java SelfCheck.java
java SelfCheck
~~~

Starter có thể FAIL hoặc chưa compile ở bài được đánh dấu compile-error repair. Lời giải phải in PASS.

## Chạy toàn bộ lời giải

~~~powershell
./verify-solutions.ps1
~~~

## Cách học

1. Đọc README trong code trước.
2. Viết dự đoán output hoặc evidence plan.
3. Làm bài mà không mở solutions.
4. Chạy SelfCheck.
5. Chỉ sau đó đọc solutions và ghi lại điều mình đã bỏ sót.

