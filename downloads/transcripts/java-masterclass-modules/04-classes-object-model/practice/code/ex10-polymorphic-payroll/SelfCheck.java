public class SelfCheck {
    private static void check(boolean ok, String message) {
        if (!ok) throw new AssertionError(message);
    }
    public static void main(String[] args) {
        Main.PayrollWorker a = new Main.Employee(1000);
        Main.PayrollWorker b = new Main.HourlyWorker(20, 10);
        check(Main.payrollReport(a, b).equals("employee=1000|hourly=200"), "report");
        check(Main.payrollReport().equals(""), "empty");
        check(a.role().equals("employee") && b.role().equals("hourly"), "roles");
        System.out.println("PASS");
    }
}

