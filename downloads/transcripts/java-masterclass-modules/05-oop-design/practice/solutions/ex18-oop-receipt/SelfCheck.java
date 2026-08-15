public class SelfCheck {
    private static void check(boolean ok, String message) {
        if (!ok) throw new AssertionError(message);
    }
    public static void main(String[] args) {
        Main.Receipt r=new Main.Receipt(java.util.List.of(new Main.Line("book",100),new Main.Line("sale",20)));
        check(r.total()==120,"total");check(r.render().equals("book=100\nsale=20\nTOTAL=120"),"render");
        check(new Main.Receipt(java.util.List.of()).render().equals("TOTAL=0"),"empty");
        boolean threw=false;try{new Main.Line("x",-1);}catch(IllegalArgumentException e){threw=true;}check(threw,"invalid");
        System.out.println("PASS");
    }
}

