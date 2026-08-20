public class Main { public static long delay(int a) { if(a<0) throw new IllegalArgumentException(); long d=100; for(int i=0;i<a&&d<1000;i++) d=Math.min(1000,d*2); return d; } }
