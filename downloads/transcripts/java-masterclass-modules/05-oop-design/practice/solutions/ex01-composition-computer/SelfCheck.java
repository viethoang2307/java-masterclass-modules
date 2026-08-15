public class SelfCheck {
    private static void check(boolean ok, String message) {
        if (!ok) throw new AssertionError(message);
    }
    public static void main(String[] args) {
        Main.Monitor monitor = new Main.Monitor();
        Main.Computer computer = new Main.Computer(monitor);
        check(computer.boot().equals("booted=true;monitor=ON"), "delegation");
        check(monitor.isOn(), "component state");
        boolean threw = false;
        try { new Main.Computer(null); } catch (IllegalArgumentException ex) { threw = true; }
        check(threw, "null component");
        System.out.println("PASS");
    }
}

