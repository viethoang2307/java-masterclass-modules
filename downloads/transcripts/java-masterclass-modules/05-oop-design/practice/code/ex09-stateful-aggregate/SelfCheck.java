public class SelfCheck {
    private static void check(boolean ok, String message) {
        if (!ok) throw new AssertionError(message);
    }
    public static void main(String[] args) {
        Main.Order o=new Main.Order();
        check(o.addItem("A"),"add");check(o.submit(),"submit");check(o.report().equals("SUBMITTED:1"),"report");
        check(!o.addItem("B"),"add after submit");check(o.cancel(),"cancel");check(!o.submit(),"submit canceled");
        Main.Order empty=new Main.Order();check(!empty.submit(),"empty submit");
        System.out.println("PASS");
    }
}

