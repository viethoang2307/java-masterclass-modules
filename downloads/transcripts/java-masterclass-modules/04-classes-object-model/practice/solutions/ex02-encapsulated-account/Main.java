public class Main {
    static final class Account {
        private final String id;
        private long balance;

        Account(String id, long openingBalance) {
            if (id == null || id.isBlank() || openingBalance < 0) {
                throw new IllegalArgumentException();
            }
            this.id = id.trim();
            this.balance = openingBalance;
        }

        String id() { return id; }
        long balance() { return balance; }
        boolean deposit(long amount) {
            if (amount <= 0) return false;
            balance += amount;
            return true;
        }
        boolean withdraw(long amount) {
            if (amount <= 0 || amount > balance) return false;
            balance -= amount;
            return true;
        }
    }

    public static void main(String[] args) {
        Account account = new Account("A1", 100);
        account.deposit(50);
        System.out.println(account.balance());
    }
}

