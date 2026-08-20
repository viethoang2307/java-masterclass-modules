public class Main {
    static String directive(boolean appearsInPublicApi, boolean neededAtRuntime) {
        if (appearsInPublicApi) return "requires transitive";
        return neededAtRuntime ? "requires" : "requires static";
    }
}
