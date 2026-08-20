public class SelfCheck{public static void main(String[]a){if(!"UI".equals(Main.threadFor("setText"))||!"BG".equals(Main.threadFor("loadFile")))throw new AssertionError();System.out.println("PASS");}}
