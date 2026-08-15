public class SelfCheck {
    private static void check(boolean ok, String message) {
        if (!ok) throw new AssertionError(message);
    }
    public static void main(String[] args) {
        Main.Money a=new Main.Money("usd",150), b=new Main.Money("USD",150), c=new Main.Money("USD",151);
        check(a.equals(b), "equals"); check(a.hashCode()==b.hashCode(), "hash");
        check(!a.equals(c) && !a.equals(null), "different/null");
        check(a.toString().equals("USD:150"), "string");
        System.out.println("PASS");
    }
}

