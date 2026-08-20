public class Main {
    public static boolean stops() throws InterruptedException {
        class StopWorker implements Runnable {
            private volatile boolean running = true;
            void stop() { running = false; }
            public void run() {
                while (running) Thread.onSpinWait();
            }
        }
        StopWorker task = new StopWorker();
        Thread worker = new Thread(task, "stoppable");
        worker.start();
        task.stop();
        worker.join(500);
        return !worker.isAlive();
    }
}
