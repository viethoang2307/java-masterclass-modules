import java.util.List;
import java.util.Map;
public class SelfCheck {
    public static void main(String[] args) {
        Map<String,Integer> f = Main.frequencies("Java, map! JAVA; Việt Việt 17.");
        check(f.equals(Map.of("java",2,"map",1,"việt",2,"17",1)));
        check(List.copyOf(f.keySet()).equals(List.of("17","java","map","việt")));
        try { f.put("x",1); throw new AssertionError(); } catch (UnsupportedOperationException expected) { }
        System.out.println("PASS");
    }
    static void check(boolean ok) { if (!ok) throw new AssertionError(); }
}
