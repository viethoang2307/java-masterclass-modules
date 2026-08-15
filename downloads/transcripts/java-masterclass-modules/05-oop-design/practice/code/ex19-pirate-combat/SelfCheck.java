public class SelfCheck {
    private static void check(boolean ok, String message) {
        if (!ok) throw new AssertionError(message);
    }
    public static void main(String[] args) {
        Main.Pirate a=new Main.Pirate("A",10,30),b=new Main.Pirate("B",3,25);
        check(Main.fight(a,b).equals("A"),"winner");check(a.alive()&&!b.alive(),"state");
        boolean threw=false;try{new Main.Pirate("x",0,1);}catch(IllegalArgumentException e){threw=true;}check(threw,"invalid");
        System.out.println("PASS");
    }
}

