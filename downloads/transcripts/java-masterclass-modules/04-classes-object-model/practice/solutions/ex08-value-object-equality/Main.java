public class Main {
    static final class UserId {
        private final String value;
        UserId(String value) {
            if (value == null || value.isBlank()) throw new IllegalArgumentException();
            this.value = value.strip();
        }
        String value() { return value; }

        @Override public boolean equals(Object other) {
            return other instanceof UserId id && value.equals(id.value);
        }
        @Override public int hashCode() { return value.hashCode(); }
        @Override public String toString() { return "UserId[" + value + "]"; }
    }

    public static void main(String[] args) {
        System.out.println(new UserId("A1"));
    }
}

