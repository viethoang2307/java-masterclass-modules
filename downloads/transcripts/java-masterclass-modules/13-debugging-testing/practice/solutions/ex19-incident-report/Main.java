public class Main{public static String report(String i,String e,String a){if(i==null||e==null||a==null||i.isBlank())throw new IllegalArgumentException();return i+"|expected="+e+"|actual="+a;}}
