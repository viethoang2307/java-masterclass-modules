public class Main {
    public static String run() throws InterruptedException {
        StringBuilder result = new StringBuilder();
        Thread worker = new Thread(() -> result.append("worker-done"), "worker-1");
        worker.start();
        worker.join();
        return result.toString();
    }
}
