import java.util.*;
import java.util.stream.*;

public class Main {
    public record Student(String id, double percent, List<String> courses) {
        public Student { courses = List.copyOf(courses); }
    }

    public static Map<String, Double> averageByCourse(List<Student> students) {
        return students.stream()
            .flatMap(student -> student.courses().stream()
                .map(course -> Map.entry(course, student.percent())))
            .collect(Collectors.groupingBy(
                Map.Entry::getKey, TreeMap::new,
                Collectors.averagingDouble(Map.Entry::getValue)));
    }

    public static void main(String[] args) {
        System.out.println(averageByCourse(List.of(
            new Student("a", 80, List.of("java")))));
    }
}

