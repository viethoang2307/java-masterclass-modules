public class Main {
    record Student(String name, int score) {}
    static String report(Student student) {
        // TODO: Java 17 text block and formatted.
        return "TODO";
    }
    public static void main(String[] args) {
        System.out.print(report(new Student("An", 82)));
    }
}

