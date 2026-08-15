import java.util.List;
public class SelfCheck {
    public static void main(String[] args) {
        Main.Inventory inventory = new Main.Inventory();
        inventory.receive(" java-17 ", 5); inventory.receive("JAVA-17", 2);
        check(inventory.quantity("Java-17") == 7 && inventory.consume("java-17", 3));
        check(!inventory.consume("java-17", 5) && inventory.quantity("java-17") == 4);
        inventory.receive("A", 1);
        check(List.copyOf(inventory.snapshot().keySet()).equals(List.of("A","JAVA-17")));
        System.out.println("PASS");
    }
    static void check(boolean ok) { if (!ok) throw new AssertionError(); }
}
