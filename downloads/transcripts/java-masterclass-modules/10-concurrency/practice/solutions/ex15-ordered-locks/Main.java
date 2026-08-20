import java.util.concurrent.locks.ReentrantLock;

public class Main {
    private static final class Wallet {
        final int id;
        final ReentrantLock lock = new ReentrantLock();
        long cents;
        Wallet(int id, long cents) { this.id = id; this.cents = cents; }
    }

    private static void move(Wallet from, Wallet to) {
        Wallet first = from.id < to.id ? from : to;
        Wallet second = first == from ? to : from;
        first.lock.lock();
        try {
            second.lock.lock();
            try { from.cents--; to.cents++; }
            finally { second.lock.unlock(); }
        } finally { first.lock.unlock(); }
    }

    public static boolean completes() throws InterruptedException {
        Wallet left = new Wallet(10, 10_000), right = new Wallet(20, 10_000);
        Thread a = new Thread(() -> { for (int i = 0; i < 5_000; i++) move(left, right); });
        Thread b = new Thread(() -> { for (int i = 0; i < 5_000; i++) move(right, left); });
        a.start(); b.start(); a.join(1_000); b.join(1_000);
        return !a.isAlive() && !b.isAlive() && left.cents + right.cents == 20_000;
    }
}
