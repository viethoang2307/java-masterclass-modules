public class SelfCheck {
    public static void main(String[] args) throws Exception {
        if (!Main.stops()) throw new AssertionError("worker vẫn sống");
        System.out.println("PASS");
    }
}
