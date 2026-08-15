public class Main {
    static String classify(int score) {
        if (score < 0 || score > 100) return "INVALID";
        if (score < 50) return "FAIL";
        if (score < 80) return "PASS";
        return "DISTINCTION";
    }

    public static void main(String[] args) {
        System.out.println(classify(82));
    }
}

