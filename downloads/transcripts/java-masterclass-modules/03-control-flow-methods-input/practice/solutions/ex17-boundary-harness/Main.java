public class Main {
    static String classify(int score) {
        if (score < 0 || score > 100) return "INVALID";
        if (score < 50) return "FAIL";
        if (score < 80) return "PASS";
        return "DISTINCTION";
    }

    static int runBoundaryChecks() {
        int[] inputs = {-1, 0, 49, 50, 79, 80, 100, 101};
        String[] expected = {
            "INVALID", "FAIL", "FAIL", "PASS",
            "PASS", "DISTINCTION", "DISTINCTION", "INVALID"
        };
        int passed = 0;
        for (int i = 0; i < inputs.length; i++) {
            if (classify(inputs[i]).equals(expected[i])) passed++;
        }
        return passed;
    }

    public static void main(String[] args) {
        System.out.println("passed=" + runBoundaryChecks());
    }
}

