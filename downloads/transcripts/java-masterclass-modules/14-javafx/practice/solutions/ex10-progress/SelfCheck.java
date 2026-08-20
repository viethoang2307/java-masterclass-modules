public class SelfCheck{public static void main(String[]a){if(Main.progress(0,0)!=0||Main.progress(5,10)!=.5||Main.progress(12,10)!=1)throw new AssertionError();System.out.println("PASS");}}
