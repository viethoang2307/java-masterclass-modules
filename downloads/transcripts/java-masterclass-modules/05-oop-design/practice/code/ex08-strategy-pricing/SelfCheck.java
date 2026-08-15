public class SelfCheck {
    private static void check(boolean ok, String message) {
        if (!ok) throw new AssertionError(message);
    }
    public static void main(String[] args) {
        check(Main.finalPrice(1000,new Main.FullPrice())==1000,"full");
        check(Main.finalPrice(1000,new Main.PercentOff(10))==900,"discount");
        check(Main.finalPrice(1000,new Main.PercentOff(100))==0,"free");
        boolean threw=false;try{new Main.PercentOff(101);}catch(IllegalArgumentException e){threw=true;}check(threw,"percent");
        System.out.println("PASS");
    }
}

