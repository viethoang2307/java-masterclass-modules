import java.util.Scanner;

public class Main {
    static String processCommands(String input) {
        Scanner scanner = new Scanner(input == null ? "" : input);
        int balance = 0;
        boolean running = true;
        while (running && scanner.hasNext()) {
            String token = scanner.next();
            switch (token) {
                case "1" -> balance += 10;
                case "2" -> balance = Math.max(0, balance - 3);
                case "3" -> { /* status is represented in final result */ }
                case "0" -> running = false;
                default -> { /* invalid command is consumed */ }
            }
        }
        return "balance=" + balance + ";status=" + balance;
    }

    public static void main(String[] args) {
        System.out.println(processCommands("1 1 2 3 3 0"));
    }
}

