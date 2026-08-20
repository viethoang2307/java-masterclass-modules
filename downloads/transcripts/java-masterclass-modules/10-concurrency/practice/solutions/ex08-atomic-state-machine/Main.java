import java.util.concurrent.atomic.AtomicReference;

public class Main {
    private enum State { NEW, RUNNING, STOPPED }

    public static String finalState() throws InterruptedException {
        AtomicReference<State> state = new AtomicReference<>(State.NEW);
        Thread[] workers = new Thread[4];
        for (int i = 0; i < workers.length; i++) {
            workers[i] = new Thread(() -> state.compareAndSet(State.NEW, State.RUNNING));
            workers[i].start();
        }
        for (Thread worker : workers) worker.join();
        if (!state.compareAndSet(State.RUNNING, State.STOPPED)) throw new AssertionError(state.get());
        return state.get().name();
    }
}
