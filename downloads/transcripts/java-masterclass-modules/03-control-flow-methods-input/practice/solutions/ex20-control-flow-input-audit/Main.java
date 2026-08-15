import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Main {
    static String run(String input) {
        Scanner scanner = new Scanner(input == null ? "" : input);
        List<Integer> scores = new ArrayList<>();
        while (scanner.hasNextLine()) {
            String line = scanner.nextLine().trim();
            if (line.equalsIgnoreCase("REPORT")) break;
            String[] parts = line.split("\\s+");
            if (parts.length != 3 || !parts[0].equalsIgnoreCase("ADD")) continue;
            if (parts[1].isBlank()) continue;
            Integer score = parseScore(parts[2]);
            if (score != null) scores.add(score);
        }
        return report(scores);
    }

    static Integer parseScore(String text) {
        try {
            int score = Integer.parseInt(text);
            return score >= 0 && score <= 100 ? score : null;
        } catch (NumberFormatException ex) {
            return null;
        }
    }

    static String classify(int score) {
        if (score < 50) return "FAIL";
        if (score < 80) return "PASS";
        return "DISTINCTION";
    }

    static String report(List<Integer> scores) {
        if (scores.isEmpty()) return "count=0";
        int fail = 0;
        int pass = 0;
        int distinction = 0;
        long sum = 0;
        for (int score : scores) {
            switch (classify(score)) {
                case "FAIL" -> fail++;
                case "PASS" -> pass++;
                case "DISTINCTION" -> distinction++;
                default -> { }
            }
            sum += score;
        }
        double average = (double) sum / scores.size();
        return String.format(java.util.Locale.ROOT,
                "count=%d;fail=%d;pass=%d;distinction=%d;average=%.1f",
                scores.size(), fail, pass, distinction, average);
    }

    public static void main(String[] args) {
        System.out.println(run("ADD An 80\nADD Binh 49\nREPORT\n"));
    }
}

