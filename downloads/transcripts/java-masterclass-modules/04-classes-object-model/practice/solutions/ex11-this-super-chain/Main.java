public class Main {
    static class Person {
        private final String name;
        Person(String name) {
            if (name == null || name.isBlank()) throw new IllegalArgumentException();
            this.name = name.strip();
        }
        String label() { return name; }
    }

    static final class Staff extends Person {
        private final String role;
        Staff(String name, String role) {
            super(name);
            if (role == null || role.isBlank()) throw new IllegalArgumentException();
            this.role = role.strip();
        }
        @Override String label() { return super.label() + " (" + role + ")"; }
    }

    public static void main(String[] args) {
        System.out.println(new Staff("An", "dev").label());
    }
}

