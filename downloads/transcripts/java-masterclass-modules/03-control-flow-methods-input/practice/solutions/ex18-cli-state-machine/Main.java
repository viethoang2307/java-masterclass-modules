import java.util.Scanner;

public class Main {
    static String run(String input) {
        Scanner scanner = new Scanner(input == null ? "" : input);
        int balance = 0;
        int events = 0;
        boolean running = true;
        while (running && scanner.hasNextLine()) {
            String line = scanner.nextLine().trim();
            if (line.isEmpty()) continue;
            String[] parts = line.split("\\s+");
            String command = parts[0].toUpperCase();
            switch (command) {
                case "ADD" -> {
                    if (parts.length == 2) {
                        Integer amount = parseNonNegative(parts[1]);
                        if (amount != null) {
                            balance += amount;
                            events++;
                        }
                    }
                }
                case "REMOVE" -> {
                    if (parts.length == 2) {
                        Integer amount = parseNonNegative(parts[1]);
                        if (amount != null) {
                            balance = Math.max(0, balance - amount);
                            events++;
                        }
                    }
                }
                case "SHOW" -> events++;
                case "QUIT" -> running = false;
                default -> { }
            }
        }
        return "balance=" + balance + ";events=" + events;
    }

    static Integer parseNonNegative(String text) {
        try {
            int value = Integer.parseInt(text);
            return value >= 0 ? value : null;
        } catch (NumberFormatException ex) {
            return null;
        }
    }

    public static void main(String[] args) {
        System.out.println(run("ADD 10\nREMOVE 3\nSHOW\nQUIT\n"));
    }
}

