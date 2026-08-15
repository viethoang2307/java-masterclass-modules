public class Main {
    static final class Monitor {
        private boolean on;
        boolean turnOn() { on = true; return on; }
        boolean isOn() { return on; }
    }

    static final class Computer {
        private final Monitor monitor;
        Computer(Monitor monitor) {
            if (monitor == null) throw new IllegalArgumentException();
            this.monitor = monitor;
        }
        String boot() {
            return "booted=" + monitor.turnOn() + ";monitor=" + (monitor.isOn() ? "ON" : "OFF");
        }
    }

    public static void main(String[] args) {
        System.out.println(new Computer(new Monitor()).boot());
    }
}

