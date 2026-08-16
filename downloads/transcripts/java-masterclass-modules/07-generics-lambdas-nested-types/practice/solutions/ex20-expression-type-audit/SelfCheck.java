public class SelfCheck {
    private static void check(boolean ok, String message) {
        if (!ok) throw new AssertionError(message);
    }
    public static void main(String[] args) {
        Main.Audit audit = Main.audit(new String[]{"java", "17"});
        check("java|17".equals(audit.args()), "args");
        check(audit.wrapped() == Integer.MIN_VALUE, "int overflow");
        check(audit.safeSum() == 2147483648L, "widen before overflow");
        check(audit.epsilonEqual(), "epsilon");
        check(audit.decimalExact(), "BigDecimal");
        check(audit.codePoint() == 'A', "char");
        check(Main.report(audit).contains("args:java|17"), "report");
        System.out.println("PASS");
    }
}

