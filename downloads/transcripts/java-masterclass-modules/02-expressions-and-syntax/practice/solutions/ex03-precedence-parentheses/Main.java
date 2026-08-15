public class Main {
    static String result() {
        int without = 10 + 2 * 3;
        int with = (10 + 2) * 3;
        return "Without=" + without + ";With=" + with;
    }

    public static void main(String[] args) {
        System.out.println(result());
    }
}

