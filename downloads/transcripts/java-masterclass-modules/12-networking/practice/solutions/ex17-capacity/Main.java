public class Main { public static int capacity(int a,int b,int c) { if(a<=0||b<=0||c<=0) throw new IllegalArgumentException(); return Math.min(a,Math.min(b,c)); } }
