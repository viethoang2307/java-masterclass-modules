public class Main {
    public static String place(boolean stockOk, boolean paymentOk) {
        if (!stockOk) return "ROLLED_BACK:STOCK";
        if (!paymentOk) return "ROLLED_BACK:PAYMENT";
        return "COMMITTED:OUTBOX";
    }
}
