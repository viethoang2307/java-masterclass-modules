public class PrimitiveChallenge {
    public static void main(String[] args) {
        byte byteValue = 10;
        short shortValue = 20;
        int intValue = 50;

        int sum = byteValue + shortValue + intValue;
        long base = 50_000L;
        long total = base + 10L * sum;

        System.out.println("sum = " + sum);
        System.out.println("total = " + total);
    }
}

