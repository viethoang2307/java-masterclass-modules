public class Main {
    static String result() {
        return "byte=[" + Byte.MIN_VALUE + "," + Byte.MAX_VALUE
                + "];int=[" + Integer.MIN_VALUE + "," + Integer.MAX_VALUE
                + "];intBits=" + Integer.SIZE;
    }

    public static void main(String[] args) {
        System.out.println(result());
    }
}

