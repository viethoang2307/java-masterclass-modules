public class Main {
    static String result() {
        byte byteValue = 127;
        byteValue++;
        int intValue = Integer.MAX_VALUE;
        intValue++;
        return "byte=" + byteValue + ";int=" + intValue
                + ";intMin=" + Integer.MIN_VALUE;
    }

    public static void main(String[] args) {
        System.out.println(result());
    }
}

