public class Main { public static int accepted(int[] seq) { int last=-1,count=0; for(int n:seq) if(n>last){last=n;count++;} return count; } }
