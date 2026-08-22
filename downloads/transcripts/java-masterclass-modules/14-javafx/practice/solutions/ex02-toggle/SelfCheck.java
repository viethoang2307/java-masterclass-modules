public class SelfCheck{public static void main(String[]a){if(Main.toggle(true)||!Main.toggle(false))throw new AssertionError();System.out.println("PASS");}}
