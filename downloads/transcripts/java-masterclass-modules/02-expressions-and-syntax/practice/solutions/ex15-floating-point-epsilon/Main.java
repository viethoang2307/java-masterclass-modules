public class Main {
    static String result() {
        double actual = 0.1 + 0.2;
        double expected = 0.3;
        boolean direct = actual == expected;
        boolean close = Math.abs(actual - expected) < 1e-9;
        return "direct=" + direct + ";epsilon=" + close;
    }

    public static void main(String[] args) {
        System.out.println(result());
    }
}

