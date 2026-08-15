public class Main {
    sealed interface Result permits Success, Failure {}
    record Success(String value) implements Result {}
    record Failure(String message) implements Result {}
    static String describe(Result result) {
        // TODO: pattern matching.
        return "TODO";
    }
    public static void main(String[] args) { System.out.println(describe(new Success("done"))); }
}

