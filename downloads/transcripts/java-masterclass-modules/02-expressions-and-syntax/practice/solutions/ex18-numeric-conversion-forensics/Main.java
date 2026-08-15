public class Main {
    static String result() {
        byte b = 10;
        short s = 20;
        int i = 50;
        int promoted = b + s + i;
        long widened = promoted;
        byte narrowed = (byte) 130;
        long total = 50_000L + 10L * promoted;
        return "promoted=" + promoted + ";widened=" + widened
                + ";narrowed=" + narrowed + ";total=" + total;
    }

    public static void main(String[] args) {
        System.out.println(result());
    }
}

