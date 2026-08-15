public class SelfCheck {
    private static void check(boolean ok, String message) {
        if (!ok) throw new AssertionError(message);
    }
    public static void main(String[] args) {
        Main.ProductItem p=new Main.ProductItem("book",100);Main.DiscountItem d=new Main.DiscountItem("sale",20);
        Main.Order o=new Main.Order();o.add(p);o.add(d);
        check(o.total()==80&&o.size()==2,"total");check(Main.labels(p,d).equals("book|sale"),"labels");
        System.out.println("PASS");
    }
}

