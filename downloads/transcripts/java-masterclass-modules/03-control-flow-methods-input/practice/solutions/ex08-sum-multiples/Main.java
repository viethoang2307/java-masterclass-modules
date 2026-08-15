public class Main {
    static long sumMultiples(int limit) {
        long sum = 0;
        for (int value = 1; value < limit; value++) {
            if (value % 3 == 0 || value % 5 == 0) sum += value;
        }
        return sum;
    }

    public static void main(String[] args) {
        System.out.println(sumMultiples(10));
    }
}

