# 119. Project structure và packages

## Mục tiêu

Hiểu package là namespace và boundary compile-time, biết vì sao source tree, package declaration và classpath phải khớp nhau.

## Từ source tới class

~~~text
src/main/java/com/acme/app/Main.java
        ↓ javac -d out
out/com/acme/app/Main.class
~~~

~~~java
package com.acme.app;

public class Main {
    public static void main(String[] args) {
        System.out.println("ready");
    }
}
~~~

Package declaration phải là statement đầu tiên. Tên thư mục thường phản chiếu package để compiler/tooling tìm class dễ dàng; package name viết lowercase và dùng domain đảo ngược.

## Compile và run

~~~powershell
javac --release 17 -d out src/main/java/com/acme/app/Main.java
java -cp out com.acme.app.Main
~~~

javac nhận source; java nhận fully-qualified class name, không nhận đường dẫn .java. -d tách artifact khỏi source và tránh để .class lẫn trong repo.

## Lỗi thường gặp

- Chạy java Main dù class có package.
- Compile từ sai working directory.
- Có hai class cùng simple name nhưng khác package rồi import nhầm.
- Commit generated .class.

## Bài tập

Tạo com.example.collections.Main, compile vào out, chạy bằng classpath. Ghi lại output của working directory, javac và java trong một runbook ngắn.

## Checkpoint

Bạn phải giải thích được source path, package name, classpath và fully-qualified name liên kết với nhau thế nào.
