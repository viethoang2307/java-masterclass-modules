public class SelfCheck {
    private static void check(boolean ok, String message) {
        if (!ok) throw new AssertionError(message);
    }
    public static void main(String[] args) {
        Main.Product b=new Main.Book("Java",1000),d=new Main.Digital("Video",2000);
        check(b.cents()==1000&&d.cents()==1600,"pricing");
        check(Main.total(b,d)==2600,"total");
        boolean threw=false;try{new Main.Book("x",-1);}catch(IllegalArgumentException e){threw=true;}check(threw,"invalid");
        System.out.println("PASS");
    }
}

