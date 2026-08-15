public class Main {
    static String result() {
        int quotient = 5 / 2;
        int remainder = 5 % 2;
        double decimal = 5.0 / 2;
        return "Int=" + quotient + ";Remainder=" + remainder + ";Double=" + decimal;
    }

    public static void main(String[] args) {
        System.out.println(result());
    }
}

