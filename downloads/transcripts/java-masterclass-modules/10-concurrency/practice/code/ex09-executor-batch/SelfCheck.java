public class SelfCheck {
    public static void main(String[] args) throws Exception {
        int[] values = Main.squares(100);
        if (values.length != 100 || values[7] != 49 || values[99] != 9801) throw new AssertionError();
        System.out.println("PASS");
    }
}
