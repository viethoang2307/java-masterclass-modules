import java.util.List;

public class SelfCheck {
    public static void main(String[] args) {
        var first = new Main.Track("t1", "Intro");
        var result = Main.addTrack(List.of(), first);
        check(result.equals(List.of(first)));
        try { result.add(new Main.Track("t2", "Outro")); throw new AssertionError(); } catch (UnsupportedOperationException expected) { }
        expectFailure(() -> Main.addTrack(result, new Main.Track("t1", "Again")));
        expectFailure(() -> Main.addTrack(result, new Main.Track("", "No id")));
        System.out.println("PASS");
    }
    private static void check(boolean value) { if (!value) throw new AssertionError(); }
    private static void expectFailure(Runnable action) { try { action.run(); throw new AssertionError(); } catch (IllegalArgumentException expected) { } }
}
