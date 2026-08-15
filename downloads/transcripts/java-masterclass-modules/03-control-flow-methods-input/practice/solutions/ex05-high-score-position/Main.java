public class Main {
    static int calculateHighScorePosition(int score) {
        if (score < 0) return 0;
        if (score >= 1000) return 1;
        if (score >= 500) return 2;
        if (score >= 100) return 3;
        return 4;
    }

    public static void main(String[] args) {
        System.out.println(calculateHighScorePosition(1500));
    }
}

