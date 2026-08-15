public class Main {
    static long sumInclusive(int from, int to) {
        long sum = 0;
        for (int value = from; value <= to; value++) {
            sum += value;
            if (value == Integer.MAX_VALUE) break;
        }
        return sum;
    }

    public static void main(String[] args) {
        System.out.println(sumInclusive(1, 10));
    }
}

