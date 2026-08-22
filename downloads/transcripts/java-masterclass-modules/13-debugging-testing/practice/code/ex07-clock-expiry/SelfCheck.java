public class SelfCheck{public static void main(String[]a){if(Main.expired(9,10)||!Main.expired(10,10))throw new AssertionError();System.out.println("PASS");}}
