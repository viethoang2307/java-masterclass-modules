public class SelfCheck{public static void main(String[]a){if(Main.price(1000,0)!=1000||Main.price(1000,100)!=0||Main.price(1000,25)!=750)throw new AssertionError();System.out.println("PASS");}}
