public class Main {
    static final class Ticket {
        private static int nextId = 1;
        private static int created;
        private final int id;
        private final String owner;

        Ticket(String owner) {
            if (owner == null || owner.isBlank()) throw new IllegalArgumentException();
            this.owner = owner.strip();
            this.id = nextId++;
            created++;
        }
        int id() { return id; }
        String owner() { return owner; }
        static int created() { return created; }
    }

    public static void main(String[] args) {
        Ticket t = new Ticket("An");
        System.out.println(t.id());
    }
}

