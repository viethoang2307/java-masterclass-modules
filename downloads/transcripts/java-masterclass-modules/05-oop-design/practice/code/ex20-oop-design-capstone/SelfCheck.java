public class SelfCheck {
    private static void check(boolean ok, String message) {
        if (!ok) throw new AssertionError(message);
    }
    public static void main(String[] args) {
        check(Main.capstone().equals("items=3;subtotal=4500;total=4050"),"capstone");
        Main.Catalog c=new Main.Catalog();c.add(new Main.Product("X",10));Main.Order o=new Main.Order();
        check(o.buy(c.find("X"))&&o.subtotal()==10,"composition");
        check(!o.buy(c.find("missing")),"unknown");
        System.out.println("PASS");
    }
}

