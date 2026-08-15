public class SelfCheck {
    public static void main(String[] args) {
        Main.Workflow w = new Main.Workflow(); w.add("A"); w.add("B");
        check(w.transition("A", Main.State.ACTIVE));
        check(!w.transition("A", Main.State.NEW));
        check(w.transition("A", Main.State.DONE));
        check(w.counts().get(Main.State.NEW) == 1 && w.counts().get(Main.State.DONE) == 1 && w.counts().get(Main.State.BLOCKED) == 0);
        System.out.println("PASS");
    }
    static void check(boolean ok) { if (!ok) throw new AssertionError(); }
}
