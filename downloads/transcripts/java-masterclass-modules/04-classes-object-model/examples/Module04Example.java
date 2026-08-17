public class Module04Example {
    static final class Account {
        private final String id;
        private int balance;
        private Account(String id, int balance) { this.id = id; this.balance = balance; }
        static Account open(String id, int openingBalance) {
            if (openingBalance < 0) throw new IllegalArgumentException("negative balance");
            return new Account(id, openingBalance);
        }
        void deposit(int amount) {
            if (amount <= 0) throw new IllegalArgumentException("amount");
            balance += amount;
        }
        String summary() { return id + ":" + balance; }
    }
    public static void main(String[] args) {
        Account account = Account.open("A-01", 100);
        account.deposit(25);
        System.out.println(account.summary());
    }
}