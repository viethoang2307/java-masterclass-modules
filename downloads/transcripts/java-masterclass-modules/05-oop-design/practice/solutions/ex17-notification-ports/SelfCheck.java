public class SelfCheck {
    private static void check(boolean ok, String message) {
        if (!ok) throw new AssertionError(message);
    }
    public static void main(String[] args) {
        check(Main.sendAll(" hi ",new Main.EmailSender(),new Main.SmsSender()).equals("email:hi|sms:hi"),"send");
        check(Main.sendAll("x").equals(""),"empty ports");
        boolean threw=false;try{Main.sendAll(" ");}catch(IllegalArgumentException e){threw=true;}check(threw,"blank");
        System.out.println("PASS");
    }
}

