public class SelfCheck { public static void main(String[] a) { if(Main.delay(0)!=100||Main.delay(3)!=800||Main.delay(5)!=1000) throw new AssertionError(); System.out.println("PASS"); } }
