public class SelfCheck{public static void main(String[]a){if(Main.clamp(5,0,10)!=5||Main.clamp(-1,0,10)!=0||Main.clamp(11,0,10)!=10)throw new AssertionError();System.out.println("PASS");}}
