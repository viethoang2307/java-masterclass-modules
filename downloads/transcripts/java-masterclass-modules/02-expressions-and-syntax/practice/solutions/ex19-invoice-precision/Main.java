import java.math.BigDecimal;

public class Main {
    static String result() {
        BigDecimal price = new BigDecimal("19.99");
        BigDecimal quantity = new BigDecimal("3");
        BigDecimal rate = new BigDecimal("0.10");
        BigDecimal subtotal = price.multiply(quantity);
        BigDecimal tax = subtotal.multiply(rate);
        BigDecimal total = subtotal.add(tax);
        return "subtotal=" + subtotal.toPlainString()
                + ";tax=" + tax.toPlainString()
                + ";total=" + total.toPlainString();
    }

    public static void main(String[] args) {
        System.out.println(result());
    }
}

