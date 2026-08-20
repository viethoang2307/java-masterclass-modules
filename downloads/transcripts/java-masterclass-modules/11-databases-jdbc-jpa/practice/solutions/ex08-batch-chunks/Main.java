public class Main {
    public static int batches(int rows, int batchSize) {
        if (rows < 0 || batchSize <= 0) throw new IllegalArgumentException();
        return rows / batchSize + (rows % batchSize == 0 ? 0 : 1);
    }
}
