public class Main {
    static String repaired() {
        int count = 3;
        long total = 50_000L + count;
        return "Java:" + total;
    }

    public static void main(String[] args) {
        System.out.println(repaired());
    }
}

