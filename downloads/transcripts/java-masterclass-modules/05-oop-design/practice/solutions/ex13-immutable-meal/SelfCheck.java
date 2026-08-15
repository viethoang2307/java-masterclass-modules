public class SelfCheck {
    private static void check(boolean ok, String message) {
        if (!ok) throw new AssertionError(message);
    }
    public static void main(String[] args) {
        java.util.List<String> source=new java.util.ArrayList<>(java.util.List.of("burger"));
        Main.Meal meal=new Main.Meal(" M1 ",source,500);source.add("drink");
        check(meal.id().equals("M1")&&meal.totalItems()==1&&meal.cents()==500,"state");
        boolean threw=false;try{meal.items().add("x");}catch(UnsupportedOperationException e){threw=true;}check(threw,"unmodifiable");
        System.out.println("PASS");
    }
}

