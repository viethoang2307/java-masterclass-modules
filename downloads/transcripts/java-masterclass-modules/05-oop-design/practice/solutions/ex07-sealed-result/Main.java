public class Main {
    sealed interface Result permits Success, Failure {}
    record Success(String value) implements Result {}
    record Failure(String message) implements Result {}
    static String describe(Result result) {
        if (result instanceof Success success) return "OK:" + success.value();
        if (result instanceof Failure failure) return "ERROR:" + failure.message();
        throw new IllegalStateException("unknown result");
    }
    public static void main(String[] args) { System.out.println(describe(new Success("done"))); }
}

