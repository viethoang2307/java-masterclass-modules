import java.nio.charset.*;
public class SelfCheck {
    static void check(boolean ok, String message) { if (!ok) throw new AssertionError(message); }
    public static void main(String[] args) throws Exception {
        check(Main.decode("Việt".getBytes(StandardCharsets.UTF_8)).equals("Việt"), "utf8");
        boolean failed = false;
        try { Main.decode(new byte[]{(byte) 0xC3, 0x28}); }
        catch (CharacterCodingException ex) { failed = true; }
        check(failed, "malformed");
        System.out.println("PASS");
    }
}

