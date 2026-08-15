public class Main {
    static final class Customer {
        private final String firstName;
        private final String lastName;
        private final String email;

        Customer(String firstName, String lastName, String email) {
            this.firstName = required(firstName);
            this.lastName = required(lastName);
            this.email = email == null ? "" : email.strip();
        }

        private static String required(String value) {
            if (value == null || value.isBlank()) throw new IllegalArgumentException();
            return value.strip();
        }
        String fullName() { return firstName + " " + lastName; }
        String email() { return email; }
    }

    public static void main(String[] args) {
        System.out.println(new Customer("An", "Nguyen", null).fullName());
    }
}

