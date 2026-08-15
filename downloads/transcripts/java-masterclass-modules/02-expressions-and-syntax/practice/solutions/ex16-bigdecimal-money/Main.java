import java.math.BigDecimal;

public class Main {
    static String result() {
        BigDecimal a = new BigDecimal("0.10");
        BigDecimal b = new BigDecimal("0.20");
        return "money=" + a.add(b).toPlainString();
    }

    public static void main(String[] args) {
        System.out.println(result());
    }
}

