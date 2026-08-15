public class Main {
    interface PricingStrategy { long discount(long cents); }
    static final class FullPrice implements PricingStrategy { public long discount(long cents){return 0;} }
    static final class PercentOff implements PricingStrategy {
        private final int percent;
        PercentOff(int percent){if(percent<0||percent>100)throw new IllegalArgumentException();this.percent=percent;}
        public long discount(long cents){return cents*percent/100;}
    }
    static long finalPrice(long base, PricingStrategy strategy) {
        if (base<0 || strategy==null) throw new IllegalArgumentException();
        return base - Math.min(base, strategy.discount(base));
    }
    public static void main(String[] args) { System.out.println(finalPrice(1000,new PercentOff(10))); }
}

