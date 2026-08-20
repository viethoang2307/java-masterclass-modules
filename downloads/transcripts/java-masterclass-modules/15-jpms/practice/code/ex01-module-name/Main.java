import java.util.Set;

public class Main {
    static boolean isValidModuleName(String name) {
        // TODO: validate every dot-separated segment as a non-keyword Java identifier.
        return false;
    }

    public static void main(String[] args) {
        System.out.println(isValidModuleName(args.length == 0 ? "com.example.app" : args[0]));
    }
}
