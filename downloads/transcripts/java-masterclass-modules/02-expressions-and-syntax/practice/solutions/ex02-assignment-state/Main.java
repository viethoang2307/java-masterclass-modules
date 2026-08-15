public class Main {
    static String result() {
        int counter = 10;
        int start = counter;
        counter = counter + 5;
        return "Start=" + start + ";End=" + counter;
    }

    public static void main(String[] args) {
        System.out.println(result());
    }
}

