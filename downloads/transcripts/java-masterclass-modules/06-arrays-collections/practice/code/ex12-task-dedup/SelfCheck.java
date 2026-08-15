import java.util.List;
public class SelfCheck {
    public static void main(String[] args) {
        List<Main.Task> result = Main.merge(List.of(
                new Main.Task(" A-1 ", "draft", Main.Status.PLANNED),
                new Main.Task("B-2", "ship", Main.Status.IN_PROGRESS),
                new Main.Task("a-1", "reviewed", Main.Status.DONE)));
        check(result.size() == 2 && result.get(0).description().equals("reviewed") && result.get(0).status() == Main.Status.DONE);
        System.out.println("PASS");
    }
    static void check(boolean ok) { if (!ok) throw new AssertionError(); }
}
