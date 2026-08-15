import java.util.Locale;

public class Main {
    static final class Email {
        private final String value;
        Email(String value) {
            if (value == null || value.isBlank()) throw new IllegalArgumentException();
            this.value = value.strip().toLowerCase(Locale.ROOT);
        }
        String value() { return value; }
        @Override public boolean equals(Object other) {
            return other instanceof Email email && value.equals(email.value);
        }
        @Override public int hashCode() { return value.hashCode(); }
        @Override public String toString() { return "Email[" + value + "]"; }
    }

    static boolean audit() {
        Email a = new Email(" A@X.COM ");
        Email b = new Email("a@x.com");
        Email c = new Email("b@x.com");
        return a.equals(b)
                && a.hashCode() == b.hashCode()
                && !a.equals(c)
                && !a.equals(null)
                && a.toString().equals("Email[a@x.com]");
    }

    public static void main(String[] args) {
        System.out.println(audit());
    }
}

