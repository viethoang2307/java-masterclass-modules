public class SelfCheck {
    public static void main(String[] args) throws Exception {
        int[] values = new int[10_001];
        long expected = 0;
        for (int i = 0; i < values.length; i++) { values[i] = i % 17 - 8; expected += values[i]; }
        if (Main.sum(values, 7) != expected) throw new AssertionError();
        System.out.println("PASS");
    }
}
