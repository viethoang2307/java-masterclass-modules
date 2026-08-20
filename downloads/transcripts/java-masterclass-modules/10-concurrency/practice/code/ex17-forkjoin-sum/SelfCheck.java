public class SelfCheck {
    public static void main(String[] args) {
        int[] values = new int[50_000];
        long expected = 0;
        for (int i = 0; i < values.length; i++) { values[i] = i % 31; expected += values[i]; }
        if (Main.sum(values) != expected) throw new AssertionError();
        System.out.println("PASS");
    }
}
