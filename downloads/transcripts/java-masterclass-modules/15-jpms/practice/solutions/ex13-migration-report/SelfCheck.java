import java.util.List;

public class SelfCheck {
    public static void main(String[] args) {
        var input = List.of(new Main.Artifact("common.jar", "named", "com.acme.common"), new Main.Artifact("legacy.jar", "automatic", "legacy.utils"), new Main.Artifact("old.jar", "legacy", null));
        check(Main.actions(input).equals(List.of("verify-descriptor:common.jar", "pin-automatic-name:legacy.jar=legacy.utils", "keep-classpath:old.jar")));
        System.out.println("PASS");
    }
    private static void check(boolean value) { if (!value) throw new AssertionError(); }
}
