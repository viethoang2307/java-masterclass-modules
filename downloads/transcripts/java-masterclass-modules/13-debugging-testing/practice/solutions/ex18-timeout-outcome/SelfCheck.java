public class SelfCheck{public static void main(String[]a){if(!"PASS".equals(Main.outcome(10,10))||!"TIMEOUT".equals(Main.outcome(11,10)))throw new AssertionError();System.out.println("PASS");}}
