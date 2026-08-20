public class Main{public static double progress(long d,long t){if(d<0||t<0)throw new IllegalArgumentException();return t==0?0:Math.min(1.0,(double)d/t);}}
