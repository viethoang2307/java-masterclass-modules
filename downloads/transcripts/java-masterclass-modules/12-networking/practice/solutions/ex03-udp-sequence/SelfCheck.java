public class SelfCheck { public static void main(String[] a) { if (Main.accepted(new int[]{1,2,2,1,4})!=3) throw new AssertionError(); System.out.println("PASS"); } }
