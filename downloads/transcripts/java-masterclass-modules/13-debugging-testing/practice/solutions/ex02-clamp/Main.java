public class Main{public static int clamp(int v,int min,int max){if(min>max)throw new IllegalArgumentException();return Math.max(min,Math.min(max,v));}}
