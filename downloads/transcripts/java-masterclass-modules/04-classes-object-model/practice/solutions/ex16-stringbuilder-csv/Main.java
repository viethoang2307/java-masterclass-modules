public class Main {
    static String csv(int[] values) {
        if (values == null || values.length == 0) return "";
        StringBuilder result = new StringBuilder();
        for (int i = 0; i < values.length; i++) {
            if (i > 0) result.append(',');
            result.append(values[i]);
        }
        return result.toString();
    }
    public static void main(String[] args) {
        System.out.println(csv(new int[]{1, 2, 3}));
    }
}

