public class Main {
    public static String outcome(boolean dbSuccess, boolean publishSuccess) {
        if (!dbSuccess) return "ROLLED_BACK";
        return publishSuccess ? "COMMITTED:PUBLISHED" : "COMMITTED:OUTBOX_PENDING";
    }
}
