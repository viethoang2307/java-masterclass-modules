import java.util.List;

public class SelfCheck {
    public static void main(String[] args) {
        var report = Main.countByArtist(List.of(new Main.Track(" Zed ", 10), new Main.Track("Amy", 20), new Main.Track("Zed", 30)));
        check(report.toString().equals("{Amy=1, Zed=2}"));
        check(Main.countByArtist(List.of()).isEmpty());
        System.out.println("PASS");
    }
    private static void check(boolean value) { if (!value) throw new AssertionError(); }
}
