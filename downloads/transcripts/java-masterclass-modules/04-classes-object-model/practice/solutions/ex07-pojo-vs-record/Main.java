public class Main {
    record Student(String name, int score) {
        Student {
            if (name == null || name.isBlank() || score < 0 || score > 100) {
                throw new IllegalArgumentException();
            }
            name = name.strip();
        }

        String grade() {
            if (score < 50) return "FAIL";
            if (score < 80) return "PASS";
            return "DISTINCTION";
        }
    }

    public static void main(String[] args) {
        System.out.println(new Student("An", 80).grade());
    }
}

