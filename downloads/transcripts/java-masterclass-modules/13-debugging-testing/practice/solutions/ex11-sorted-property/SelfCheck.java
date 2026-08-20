public class SelfCheck{public static void main(String[]a){if(!Main.sorted(new int[]{1,1,2})||Main.sorted(new int[]{2,1}))throw new AssertionError();System.out.println("PASS");}}
