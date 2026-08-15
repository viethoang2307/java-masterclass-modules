public class Main {
    static Integer parseScore(String text) {
        if (text == null || text.isBlank()) return null;
        try {
            int score = Integer.parseInt(text.trim());
            return score >= 0 && score <= 100 ? score : null;
        } catch (NumberFormatException ex) {
            return null;
        }
    }

    public static void main(String[] args) {
        System.out.println(parseScore(" 80 "));
    }
}

