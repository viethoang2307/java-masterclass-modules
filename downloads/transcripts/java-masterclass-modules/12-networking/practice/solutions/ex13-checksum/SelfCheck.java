public class SelfCheck { public static void main(String[] a) { if(Main.checksum(new byte[]{1,2,(byte)255})!=2) throw new AssertionError(); System.out.println("PASS"); } }
