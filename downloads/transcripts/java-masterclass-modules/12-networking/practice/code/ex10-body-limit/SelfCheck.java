public class SelfCheck { public static void main(String[] a) { if(!Main.accepts(10,10)||Main.accepts(11,10)) throw new AssertionError(); System.out.println("PASS"); } }
