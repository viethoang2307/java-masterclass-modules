public class Main { public static int waves(int t,int l) { if(t<0||l<=0) throw new IllegalArgumentException(); return t/l+(t%l==0?0:1); } }
