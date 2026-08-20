public class SelfCheck { public static void main(String[] a) { if(Main.capacity(100,20,50)!=20) throw new AssertionError(); System.out.println("PASS"); } }
