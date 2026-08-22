public class SelfCheck {
    public static void main(String[] args) {
        if (!"6:1".equals(Main.counts(5))) throw new AssertionError();
        System.out.println("PASS");
    }
}
