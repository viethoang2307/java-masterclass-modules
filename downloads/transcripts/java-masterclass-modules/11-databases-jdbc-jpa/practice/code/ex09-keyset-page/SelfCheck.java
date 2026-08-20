public class SelfCheck {
    public static void main(String[] args) {
        if (!"20:40:true".equals(Main.page(20, 20, 55))) throw new AssertionError();
        if (!"40:55:false".equals(Main.page(40, 20, 55))) throw new AssertionError();
        System.out.println("PASS");
    }
}
