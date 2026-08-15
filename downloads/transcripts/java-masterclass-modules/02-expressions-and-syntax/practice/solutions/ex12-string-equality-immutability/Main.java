public class Main {
    static String result() {
        String a = new String("java");
        String b = new String("java");
        String original = "java";
        String upper = original.toUpperCase();
        return "equals=" + a.equals(b)
                + ";referenceSame=" + (a == b)
                + ";original=" + original
                + ";upper=" + upper;
    }

    public static void main(String[] args) {
        System.out.println(result());
    }
}

