# Lesson 006 — Git và Maven workflow

## Mục tiêu

Biến việc chạy Java thành workflow có thể lặp lại: source nằm trong Git, dependency nằm trong pom.xml và mọi người dùng cùng một lệnh build.

## Git tối thiểu

~~~powershell
git status
git switch -c feature/my-change
git diff
git add path/to/file
git commit -m "Describe the change"
git push -u origin feature/my-change
~~~

Mỗi commit nên có một mục đích rõ. Trước khi commit hãy kiểm tra diff, không stage secret, file build hoặc credential.

## Maven tối thiểu

Một project Maven có pom.xml mô tả coordinates, Java release, dependency và lifecycle.

~~~powershell
mvn clean test
mvn package
mvn verify
~~~

clean xóa output cũ; test chạy unit tests; package tạo artifact; verify chạy các check sau test. Không nên chỉ chạy IDE vì CI sẽ chạy command line trong môi trường khác.

## Build contract

- Java version được khai báo rõ, không phụ thuộc JAVA_HOME ngẫu nhiên.
- Dependency có version hoặc được quản lý ở parent.
- Test chạy được từ terminal.
- Artifact và target/ không commit vào Git.
- README có lệnh setup, test và run.

## Bài tập

Tạo một repository Java nhỏ, viết README setup, pom.xml tối giản và Git history gồm setup commit, feature commit và test commit. Chạy cùng một test bằng IDE và Maven.
