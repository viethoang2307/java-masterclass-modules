public class SelfCheck { public static void main(String[] a) { if(!"READ".equals(Main.ops(false))||!"READ|WRITE".equals(Main.ops(true))) throw new AssertionError(); System.out.println("PASS"); } }
