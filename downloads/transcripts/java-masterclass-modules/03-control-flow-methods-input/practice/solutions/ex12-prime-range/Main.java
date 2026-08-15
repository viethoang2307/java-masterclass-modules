public class Main {
    static boolean isPrime(int number) {
        if (number < 2) return false;
        for (int divisor = 2; (long) divisor * divisor <= number; divisor++) {
            if (number % divisor == 0) return false;
        }
        return true;
    }

    static int countPrimes(int from, int to) {
        int count = 0;
        for (int value = from; value <= to; value++) {
            if (isPrime(value)) count++;
            if (value == Integer.MAX_VALUE) break;
        }
        return count;
    }

    public static void main(String[] args) {
        System.out.println(countPrimes(1, 10));
    }
}

