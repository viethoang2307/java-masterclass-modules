public class SelfCheck{public static void main(String[]a){if(!"VALID".equals(Main.layout(640,400))||!"INVALID".equals(Main.layout(-1,400)))throw new AssertionError();System.out.println("PASS");}}
