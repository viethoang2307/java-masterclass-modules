public class Main {
    record Summary(int count, String text) {}
    static Summary summarize(String separator, String... values) {
        // TODO: normalize values and join non-blank entries.
        return new Summary(0, "");
    }
}
