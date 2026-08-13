public class NumericPromotionDemo {
    public static void main(String[] args) {
        byte byteValue = 10;
        short shortValue = 20;
        int intValue = 50;

        int promotedSum = byteValue + shortValue;
        long total = 50_000L + 10L * (byteValue + shortValue + intValue);

        System.out.println("byte + short has int result: " + promotedSum);
        System.out.println("challenge total: " + total);

        byte max = 127;
        max++;
        System.out.println("byte overflow: " + max);
    }
}

