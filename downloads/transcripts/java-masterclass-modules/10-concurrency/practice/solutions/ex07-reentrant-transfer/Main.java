import java.util.concurrent.locks.ReentrantLock;

public class Main {
    private static final class Account {
        final int id;
        final ReentrantLock lock = new ReentrantLock();
        long balance;
        Account(int id, long balance) { this.id = id; this.balance = balance; }
    }

    private static void transfer(Account from, Account to, long amount) {
        Account first = from.id < to.id ? from : to;
        Account second = first == from ? to : from;
        first.lock.lock();
        try {
            second.lock.lock();
            try {
                if (from.balance < amount) throw new AssertionError("overdraft");
                from.balance -= amount;
                to.balance += amount;
            } finally { second.lock.unlock(); }
        } finally { first.lock.unlock(); }
    }

    public static long totalAfterTransfers() throws InterruptedException {
        Account a = new Account(1, 1_000), b = new Account(2, 1_000);
        Thread one = new Thread(() -> { for (int i = 0; i < 500; i++) transfer(a, b, 1); });
        Thread two = new Thread(() -> { for (int i = 0; i < 500; i++) transfer(b, a, 1); });
        one.start(); two.start(); one.join(1_000); two.join(1_000);
        if (one.isAlive() || two.isAlive()) throw new AssertionError("deadlock");
        return a.balance + b.balance;
    }
}
