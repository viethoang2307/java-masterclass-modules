public class Main {
    static long magnitude(int number) {
        return Math.abs((long) number);
    }

    static int digitSum(int number) {
        long value = magnitude(number);
        int sum = 0;
        do {
            sum += (int) (value % 10);
            value /= 10;
        } while (value > 0);
        return sum;
    }

    static int reverseDigits(int number) {
        long value = magnitude(number);
        long reversed = 0;
        do {
            reversed = reversed * 10 + value % 10;
            value /= 10;
        } while (value > 0);
        long signed = number < 0 ? -reversed : reversed;
        return (int) signed;
    }

    public static void main(String[] args) {
        System.out.println(digitSum(1234));
        System.out.println(reverseDigits(-120));
    }
}

