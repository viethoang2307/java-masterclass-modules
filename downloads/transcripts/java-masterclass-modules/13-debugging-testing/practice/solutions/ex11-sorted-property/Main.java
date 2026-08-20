public class Main{public static boolean sorted(int[] a){if(a==null)return true;for(int i=1;i<a.length;i++)if(a[i]<a[i-1])return false;return true;}}
