public class SelfCheck{public static void main(String[]a){if(!"INC-1|expected=2|actual=3".equals(Main.report("INC-1","2","3")))throw new AssertionError();System.out.println("PASS");}}
