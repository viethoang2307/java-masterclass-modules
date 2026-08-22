public class SelfCheck{public static void main(String[]a){if(Main.attempts(2,5)!=3||Main.attempts(9,3)!=3)throw new AssertionError();System.out.println("PASS");}}
