public class SelfCheck {
    private static void check(boolean ok, String message) {
        if (!ok) throw new AssertionError(message);
    }
    public static void main(String[] args) {
        Main.Shape c=Main.factory("circle",2),s=Main.factory("square",3);
        check(Math.abs(c.area()-Math.PI*4)<1e-9,"circle");
        check(s.area()==9,"square");
        check(Math.abs(Main.areaReport(c,s)-(Math.PI*4+9))<1e-9,"total");
        boolean threw=false;try{Main.factory("triangle",1);}catch(IllegalArgumentException e){threw=true;}check(threw,"unknown");
        System.out.println("PASS");
    }
}

