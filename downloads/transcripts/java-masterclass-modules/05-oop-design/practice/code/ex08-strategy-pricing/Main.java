public class Main {
    interface PricingStrategy { long discount(long cents); }
    static final class FullPrice implements PricingStrategy {
        public long discount(long cents) { return 0; }
    }
    static final class PercentOff implements PricingStrategy {
        // TODO
    }
    static long finalPrice(long base, PricingStrategy strategy) {
        // TODO
        return 0;
    }
    public static void main(String[] args) { System.out.println("Implement strategy"); }
}

