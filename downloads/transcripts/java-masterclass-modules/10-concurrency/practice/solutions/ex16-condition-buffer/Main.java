import java.util.ArrayDeque;
import java.util.Deque;
import java.util.concurrent.locks.Condition;
import java.util.concurrent.locks.ReentrantLock;

public class Main {
    private static final class Buffer {
        private final int capacity = 2;
        private final Deque<Integer> values = new ArrayDeque<>();
        private final ReentrantLock lock = new ReentrantLock();
        private final Condition notEmpty = lock.newCondition();
        private final Condition notFull = lock.newCondition();
        void put(int value) throws InterruptedException {
            lock.lockInterruptibly();
            try {
                while (values.size() == capacity) notFull.await();
                values.addLast(value);
                notEmpty.signal();
            } finally { lock.unlock(); }
        }
        int take() throws InterruptedException {
            lock.lockInterruptibly();
            try {
                while (values.isEmpty()) notEmpty.await();
                int value = values.removeFirst();
                notFull.signal();
                return value;
            } finally { lock.unlock(); }
        }
    }

    public static int roundTrip() throws InterruptedException {
        Buffer buffer = new Buffer();
        int[] total = new int[1];
        Thread producer = new Thread(() -> {
            try { for (int i = 1; i <= 20; i++) buffer.put(i); }
            catch (InterruptedException e) { Thread.currentThread().interrupt(); }
        });
        Thread consumer = new Thread(() -> {
            try { for (int i = 1; i <= 20; i++) total[0] += buffer.take(); }
            catch (InterruptedException e) { Thread.currentThread().interrupt(); }
        });
        producer.start(); consumer.start(); producer.join(); consumer.join();
        return total[0];
    }
}
