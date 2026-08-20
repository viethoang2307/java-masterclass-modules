public class SelfCheck{public static void main(String[]a){if(!"CANCEL".equals(Main.result(null))||!"OK:x".equals(Main.result(" x ")))throw new AssertionError();System.out.println("PASS");}}
