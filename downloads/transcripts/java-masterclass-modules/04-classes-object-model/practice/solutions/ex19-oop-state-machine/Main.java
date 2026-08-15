public class Main {
    enum State { CLOSED, OPEN, LOCKED }

    static final class Door {
        private State state = State.CLOSED;
        State state() { return state; }
        boolean open() {
            if (state != State.CLOSED) return false;
            state = State.OPEN; return true;
        }
        boolean close() {
            if (state != State.OPEN) return false;
            state = State.CLOSED; return true;
        }
        boolean lock() {
            if (state != State.CLOSED) return false;
            state = State.LOCKED; return true;
        }
        boolean unlock() {
            if (state != State.LOCKED) return false;
            state = State.CLOSED; return true;
        }
    }

    static String run(String commands) {
        Door door = new Door();
        int accepted = 0;
        if (commands != null) {
            for (String raw : commands.split(",")) {
                String command = raw.strip().toLowerCase();
                boolean ok = switch (command) {
                    case "open" -> door.open();
                    case "close" -> door.close();
                    case "lock" -> door.lock();
                    case "unlock" -> door.unlock();
                    default -> false;
                };
                if (ok) accepted++;
            }
        }
        return "state=" + door.state() + ";accepted=" + accepted;
    }

    public static void main(String[] args) {
        System.out.println(run("open,close,lock,unlock,open"));
    }
}

