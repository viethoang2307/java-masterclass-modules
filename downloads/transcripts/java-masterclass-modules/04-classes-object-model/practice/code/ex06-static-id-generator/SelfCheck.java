public class SelfCheck {
    private static void check(boolean ok, String message) {
        if (!ok) throw new AssertionError(message);
    }
    public static void main(String[] args) {
        check(Main.Ticket.created() == 0, "fresh static state");
        Main.Ticket a = new Main.Ticket("An");
        Main.Ticket b = new Main.Ticket("Binh");
        check(a.id() == 1 && b.id() == 2, "sequence");
        check(a.owner().equals("An"), "owner");
        check(Main.Ticket.created() == 2, "created count");
        System.out.println("PASS");
    }
}

