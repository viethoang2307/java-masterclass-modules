public class SelfCheck{public static void main(String[]a){if(!Main.enabled(0,1)||Main.enabled(-1,1)||Main.enabled(1,1))throw new AssertionError();System.out.println("PASS");}}
