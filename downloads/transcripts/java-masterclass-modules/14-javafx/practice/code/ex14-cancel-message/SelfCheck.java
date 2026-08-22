public class SelfCheck{public static void main(String[]a){if(!"Cancelled".equals(Main.message(true))||!"Failed".equals(Main.message(false)))throw new AssertionError();System.out.println("PASS");}}
