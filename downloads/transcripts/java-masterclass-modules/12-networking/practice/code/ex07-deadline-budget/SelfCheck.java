public class SelfCheck { public static void main(String[] a) { if(Main.remaining(1000,700)!=300||Main.remaining(1000,1200)!=0) throw new AssertionError(); System.out.println("PASS"); } }
