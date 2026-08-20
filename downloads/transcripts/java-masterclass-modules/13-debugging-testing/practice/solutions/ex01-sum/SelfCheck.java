public class SelfCheck { public static void main(String[] a){if(Main.sum(new int[]{1,2,3})!=6||Main.sum(new int[0])!=0)throw new AssertionError();System.out.println("PASS");} }
