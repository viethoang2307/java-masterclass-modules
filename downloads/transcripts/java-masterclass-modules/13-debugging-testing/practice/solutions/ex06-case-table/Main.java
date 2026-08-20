public class Main{public static String grade(int s){if(s<0||s>100)throw new IllegalArgumentException();return s>=75?"DISTINCTION":s>=50?"PASS":"FAIL";}}
