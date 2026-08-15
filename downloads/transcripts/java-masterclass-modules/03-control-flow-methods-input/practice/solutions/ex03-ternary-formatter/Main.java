public class Main {
    static String formatLabel(String name, int score) {
        String safeName = name == null || name.isBlank() ? "Guest" : name.trim();
        String status = score >= 50 ? "PASS" : "FAIL";
        return safeName + ": " + status;
    }

    public static void main(String[] args) {
        System.out.println(formatLabel("An", 80));
    }
}

