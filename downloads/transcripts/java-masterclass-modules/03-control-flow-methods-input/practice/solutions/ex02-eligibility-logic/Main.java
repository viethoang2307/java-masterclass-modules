public class Main {
    static boolean canEnter(int age, boolean hasId, boolean vip) {
        return age >= 0 && (vip || (age >= 18 && hasId));
    }

    public static void main(String[] args) {
        System.out.println(canEnter(20, true, false));
    }
}

