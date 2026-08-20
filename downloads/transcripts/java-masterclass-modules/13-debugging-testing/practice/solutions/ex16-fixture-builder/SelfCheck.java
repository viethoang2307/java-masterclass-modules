public class SelfCheck{public static void main(String[]a){if(!"guest@example.com".equals(Main.user(null))||!"a@b".equals(Main.user("a@b")))throw new AssertionError();System.out.println("PASS");}}
