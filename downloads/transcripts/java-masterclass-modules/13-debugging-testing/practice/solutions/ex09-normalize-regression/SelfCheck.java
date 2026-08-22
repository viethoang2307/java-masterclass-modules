public class SelfCheck{public static void main(String[]a){if(!"hello".equals(Main.normalize("  Hello ")))throw new AssertionError();System.out.println("PASS");}}
