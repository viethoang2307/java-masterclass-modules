public class Main {
    static String result() {
        boolean loggedIn = true;
        boolean locked = false;
        boolean canEnter = loggedIn && !locked;
        boolean needsReset = locked;
        return "canEnter=" + canEnter + ";needsReset=" + needsReset;
    }

    public static void main(String[] args) {
        System.out.println(result());
    }
}

