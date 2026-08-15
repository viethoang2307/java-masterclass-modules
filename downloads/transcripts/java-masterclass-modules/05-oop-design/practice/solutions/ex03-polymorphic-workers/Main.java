public class Main {
    static abstract class Worker {
        private final String name;
        Worker(String name) { if (name == null || name.isBlank()) throw new IllegalArgumentException(); this.name = name.strip(); }
        String name() { return name; }
        abstract long pay();
    }
    static final class Employee extends Worker {
        private final long monthly;
        Employee(String name, long monthly) { super(name); if (monthly < 0) throw new IllegalArgumentException(); this.monthly = monthly; }
        @Override long pay() { return monthly; }
    }
    static final class Hourly extends Worker {
        private final long rate; private final int hours;
        Hourly(String name, long rate, int hours) { super(name); if (rate < 0 || hours < 0) throw new IllegalArgumentException(); this.rate=rate; this.hours=hours; }
        @Override long pay() { return rate * hours; }
    }
    static long totalPay(Worker... workers) {
        long total = 0;
        for (Worker worker : workers) total += worker.pay();
        return total;
    }
    public static void main(String[] args) { System.out.println(totalPay(new Employee("An",1000))); }
}

