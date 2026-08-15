public class Main {
    static String result() {
        char letter = 'A';
        char newline = '\n';
        return "letter=" + letter + ";code=" + (int) letter
                + ";newlineCode=" + (int) newline;
    }

    public static void main(String[] args) {
        System.out.println(result());
    }
}
