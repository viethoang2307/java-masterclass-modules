public class SelfCheck { public static void main(String[] a) { if(Main.waves(0,4)!=0||Main.waves(10,4)!=3) throw new AssertionError(); System.out.println("PASS"); } }
