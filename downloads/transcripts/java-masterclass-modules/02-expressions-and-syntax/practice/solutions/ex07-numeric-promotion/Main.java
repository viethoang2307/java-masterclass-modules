public class Main {
    static String result() {
        byte b = 10;
        short s = 20;
        int sum = b + s;
        String runtimeWrapper = Integer.valueOf(sum).getClass().getSimpleName();
        return "wrapper=" + runtimeWrapper + ";sum=" + sum;
    }

    public static void main(String[] args) {
        System.out.println(result());
    }
}

