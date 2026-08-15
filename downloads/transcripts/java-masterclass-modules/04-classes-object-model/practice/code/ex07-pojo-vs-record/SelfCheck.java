public class SelfCheck {
    private static void check(boolean ok, String message) {
        if (!ok) throw new AssertionError(message);
    }
    public static void main(String[] args) {
        Main.Student s = new Main.Student(" An ", 80);
        check(s.name().equals("An"), "accessor/normalize");
        check(s.score() == 80, "score");
        check(s.grade().equals("DISTINCTION"), "grade");
        check(new Main.Student("B", 50).grade().equals("PASS"), "pass");
        boolean threw = false;
        try { new Main.Student("C", 101); } catch (IllegalArgumentException ex) { threw = true; }
        check(threw, "invalid score");
        System.out.println("PASS");
    }
}

