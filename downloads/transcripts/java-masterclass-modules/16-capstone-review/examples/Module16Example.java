import java.util.*;

public class Module16Example {
    record Report(int accepted, int rejected, List<String> errors) {}
    static Report review(List<String> input) {
        int accepted = 0, rejected = 0;
        List<String> errors = new ArrayList<>();
        for (String value : input) {
            if (value != null && !value.isBlank()) accepted++;
            else { rejected++; errors.add("blank input"); }
        }
        return new Report(accepted, rejected, List.copyOf(errors));
    }
    public static void main(String[] args) {
        System.out.println(review(Arrays.asList("java", "", null)));
    }
}