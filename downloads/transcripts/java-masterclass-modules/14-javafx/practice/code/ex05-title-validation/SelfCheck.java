public class SelfCheck{public static void main(String[]a){if(!Main.valid("x")||Main.valid("")||Main.valid(" "))throw new AssertionError();System.out.println("PASS");}}
