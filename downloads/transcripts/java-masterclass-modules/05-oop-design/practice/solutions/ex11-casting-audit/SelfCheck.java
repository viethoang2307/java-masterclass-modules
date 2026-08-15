public class SelfCheck {
    private static void check(boolean ok, String message) {
        if (!ok) throw new AssertionError(message);
    }
    public static void main(String[] args) {
        Main.Vehicle gas=new Main.Vehicle("G1"), electric=new Main.ElectricVehicle("E1");
        check(Main.describe(gas).equals("G1"),"base");
        check(Main.describe(electric).equals("E1:charge"),"pattern");
        boolean threw=false;try{Main.describe(null);}catch(IllegalArgumentException e){threw=true;}check(threw,"null");
        System.out.println("PASS");
    }
}

