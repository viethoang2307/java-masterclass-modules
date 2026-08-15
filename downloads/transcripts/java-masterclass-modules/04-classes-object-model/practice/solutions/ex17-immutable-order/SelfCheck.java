public class SelfCheck {
    private static void check(boolean ok, String message) {
        if (!ok) throw new AssertionError(message);
    }
    public static void main(String[] args) {
        java.util.List<String> original = new java.util.ArrayList<>(java.util.List.of("book"));
        Main.Order order = new Main.Order(" O1 ", original);
        original.add("pen");
        check(order.id().equals("O1"), "id");
        check(order.totalItems() == 1, "defensive copy");
        boolean threw = false;
        try { order.items().add("pen"); } catch (UnsupportedOperationException ex) { threw = true; }
        check(threw, "unmodifiable");
        boolean nullItem = false;
        try { new Main.Order("O2", java.util.Arrays.asList("x", null)); } catch (NullPointerException ex) { nullItem = true; }
        check(nullItem, "null item");
        System.out.println("PASS");
    }
}

