public class Main {
    static String outcome(boolean began, boolean workSucceeded, boolean commitSucceeded, boolean rollbackSucceeded) {
        if (!began) return "not-started";
        if (workSucceeded && commitSucceeded) return "committed";
        return rollbackSucceeded ? "rolled-back" : "rollback-failed";
    }
}
