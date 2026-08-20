import java.util.concurrent.ArrayBlockingQueue;
import java.util.concurrent.BlockingQueue;

public class Main {
    public static int sum() throws InterruptedException {
        BlockingQueue<Integer> queue = new ArrayBlockingQueue<>(4);
        int[] result = new int[1];
        Thread producer = new Thread(() -> {
            try {
                for (int i = 1; i <= 100; i++) queue.put(i);
                queue.put(-1);
            } catch (InterruptedException e) {
                Thread.currentThread().interrupt();
            }
        }, "producer");
        Thread consumer = new Thread(() -> {
            try {
                int total = 0;
                for (;;) {
                    int value = queue.take();
                    if (value == -1) break;
                    total += value;
                }
                result[0] = total;
            } catch (InterruptedException e) {
                Thread.currentThread().interrupt();
            }
        }, "consumer");
        producer.start(); consumer.start();
        producer.join(); consumer.join();
        return result[0];
    }
}
