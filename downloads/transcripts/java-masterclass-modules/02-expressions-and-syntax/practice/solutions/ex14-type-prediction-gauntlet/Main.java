public class Main {
    static String result() {
        int first = 10 + 5 * 2;
        double second = (double) 10 / 4;
        String third = "A" + 1 + 2;
        return "first=int:" + first
                + ";second=double:" + second
                + ";third=String:" + third;
    }

    public static void main(String[] args) {
        System.out.println(result());
    }
}

