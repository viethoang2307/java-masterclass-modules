import java.util.List;
import java.util.TreeMap;
public class SelfCheck {
    public static void main(String[] args) {
        TreeMap<Integer,String> map = new TreeMap<>(); map.put(8,"A"); map.put(11,"B"); map.put(17,"C"); map.put(21,"D");
        Main.Query q = Main.query(map, 15, 10, 21);
        check(q.active().getKey() == 11 && q.next().getKey() == 17);
        check(List.copyOf(q.range().keySet()).equals(List.of(11,17)));
        map.put(15,"X"); check(!q.range().containsKey(15));
        System.out.println("PASS");
    }
    static void check(boolean ok) { if (!ok) throw new AssertionError(); }
}
