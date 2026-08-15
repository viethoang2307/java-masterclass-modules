public class Main {
    static String report(String name, int attempts, boolean active, char grade) {
        return "name=" + name + ";attempts=" + attempts
                + ";active=" + active + ";grade=" + grade;
    }

    static String result() {
        return report("Viet", 3, true, 'A');
    }

    public static void main(String[] args) {
        System.out.println(result());
    }
}

