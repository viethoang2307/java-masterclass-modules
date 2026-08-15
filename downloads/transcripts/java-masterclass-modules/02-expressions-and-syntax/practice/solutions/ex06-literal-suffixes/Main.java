public class Main {
    static String result() {
        long population = 3_000_000_000L;
        float ratio = 0.5f;
        double average = 2.5;
        return "long=" + population + ";float=" + ratio + ";double=" + average;
    }

    public static void main(String[] args) {
        System.out.println(result());
    }
}

