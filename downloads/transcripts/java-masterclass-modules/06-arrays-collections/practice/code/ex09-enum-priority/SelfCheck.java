import java.util.List;
public class SelfCheck {
    public static void main(String[] args) {
        List<Main.Job> jobs = List.of(new Main.Job("build", Main.Priority.HIGH), new Main.Job("alarm", Main.Priority.CRITICAL), new Main.Job("audit", Main.Priority.HIGH));
        check(Main.schedule(jobs).stream().map(Main.Job::name).toList().equals(List.of("alarm", "audit", "build")));
        check(Main.label(Main.Priority.CRITICAL).equals("P0/1h"));
        System.out.println("PASS");
    }
    static void check(boolean ok) { if (!ok) throw new AssertionError(); }
}
