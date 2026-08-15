public class Main {
    static abstract class PayrollWorker {
        abstract String role();
        abstract long pay();
    }

    static final class Employee extends PayrollWorker {
        private final long monthly;
        Employee(long monthly) { if (monthly < 0) throw new IllegalArgumentException(); this.monthly = monthly; }
        @Override String role() { return "employee"; }
        @Override long pay() { return monthly; }
    }

    static final class HourlyWorker extends PayrollWorker {
        private final long rate;
        private final int hours;
        HourlyWorker(long rate, int hours) {
            if (rate < 0 || hours < 0) throw new IllegalArgumentException();
            this.rate = rate; this.hours = hours;
        }
        @Override String role() { return "hourly"; }
        @Override long pay() { return rate * hours; }
    }

    static String payrollReport(PayrollWorker... workers) {
        StringBuilder result = new StringBuilder();
        for (int i = 0; i < workers.length; i++) {
            if (i > 0) result.append('|');
            result.append(workers[i].role()).append('=').append(workers[i].pay());
        }
        return result.toString();
    }

    public static void main(String[] args) {
        System.out.println(payrollReport(new Employee(1000), new HourlyWorker(20, 10)));
    }
}

