public class SelfCheck {
    private static void check(boolean ok, String message) {
        if (!ok) throw new AssertionError(message);
    }
    public static void main(String[] args) {
        check(Main.run("ADD A 10\nADD B 25\nBUY A\nBUY B\nBUY A\nREPORT\n")
                .equals("items=3;distinct=2;total=45"), "normal");
        check(Main.run("ADD A 10\nBUY X\nREPORT").equals("items=0;distinct=0;total=0"), "unknown sku");
        check(Main.run("ADD A -1\nBUY A\nREPORT").equals("items=0;distinct=0;total=0"), "invalid price");
        check(Main.run(null).equals("items=0;distinct=0;total=0"), "empty");
        System.out.println("PASS");
    }
}

