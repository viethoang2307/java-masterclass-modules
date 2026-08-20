public class Main {
    private static final class Account {
        private long balance;
        synchronized void deposit(long amount) { balance += amount; }
        synchronized boolean withdraw(long amount) {
            if (balance < amount) return false;
            balance -= amount;
            return true;
        }
        synchronized long balance() { return balance; }
    }

    public static long finalBalance() throws InterruptedException {
        Account account = new Account();
        Thread[] workers = new Thread[8];
        for (int i = 0; i < workers.length; i++) {
            workers[i] = new Thread(() -> {
                for (int j = 0; j < 10_000; j++) {
                    account.deposit(1);
                    if (!account.withdraw(1)) throw new AssertionError("unexpected overdraft");
                    account.deposit(1);
                }
            }, "bank-" + i);
            workers[i].start();
        }
        for (Thread worker : workers) worker.join();
        return account.balance();
    }
}
