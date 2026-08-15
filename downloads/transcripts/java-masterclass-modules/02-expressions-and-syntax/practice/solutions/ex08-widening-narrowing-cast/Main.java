public class Main {
    static String result() {
        int original = 100;
        long widened = original;
        byte narrowed = (byte) 130;
        return "widened=" + widened + ";narrowed=" + narrowed;
    }

    public static void main(String[] args) {
        System.out.println(result());
    }
}

