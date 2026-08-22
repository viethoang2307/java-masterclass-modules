public class Main{public static int price(int c,int p){if(c<0||p<0||p>100)throw new IllegalArgumentException();return c-(c*p/100);}}
