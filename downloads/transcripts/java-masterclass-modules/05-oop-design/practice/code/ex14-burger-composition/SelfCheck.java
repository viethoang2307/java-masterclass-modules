public class SelfCheck {
    private static void check(boolean ok, String message) {
        if (!ok) throw new AssertionError(message);
    }
    public static void main(String[] args) {
        Main.Burger b=new Main.Burger(500);
        check(b.addTopping("cheese",50),"first");check(!b.addTopping("cheese",50),"duplicate");
        check(b.addTopping(" bacon ",100)&&b.totalCents()==650,"price");
        check(b.toppingCount()==2,"count");check(!b.addTopping(" ",10),"blank");
        System.out.println("PASS");
    }
}

