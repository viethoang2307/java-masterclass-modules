import java.math.BigDecimal;

public class Main {
    static String result() {
        byte b = 10;
        short s = 20;
        int i = 50;
        int sum = b + s + i;
        long total = 50_000L + 10L * sum;

        double actual = 0.1 + 0.2;
        boolean close = Math.abs(actual - 0.3) < 1e-9;
        BigDecimal money = new BigDecimal("0.10")
                .add(new BigDecimal("0.20"));

        char grade = 'A';
        boolean active = true;
        String label = "Java";

        return "sum=" + sum + ";total=" + total
                + ";floatClose=" + close
                + ";money=" + money.toPlainString()
                + ";grade=" + grade + ";active=" + active
                + ";label=" + label;
    }

    public static void main(String[] args) {
        System.out.println(result());
    }
}

