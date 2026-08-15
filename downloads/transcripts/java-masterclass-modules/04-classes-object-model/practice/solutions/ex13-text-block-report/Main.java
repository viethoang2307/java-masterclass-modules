public class Main {
    record Student(String name, int score) {}
    static String report(Student student) {
        return """
                Name: %s
                Score: %d
                """.formatted(student.name(), student.score());
    }
    public static void main(String[] args) {
        System.out.print(report(new Student("An", 82)));
    }
}

