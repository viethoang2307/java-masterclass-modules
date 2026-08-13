import java.math.BigDecimal;

public class FloatingPointDemo {
    public static void main(String[] args) {
        double actual = 0.1 + 0.2;
        double expected = 0.3;
        double epsilon = 1e-9;

        System.out.println("double actual = " + actual);
        System.out.println("direct comparison = " + (actual == expected));
        System.out.println("epsilon comparison = "
                + (Math.abs(actual - expected) < epsilon));

        BigDecimal decimalActual = new BigDecimal("0.1")
                .add(new BigDecimal("0.2"));
        System.out.println("BigDecimal actual = " + decimalActual);
    }
}

