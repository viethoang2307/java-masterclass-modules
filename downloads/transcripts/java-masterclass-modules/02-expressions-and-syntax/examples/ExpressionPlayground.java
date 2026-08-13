public class ExpressionPlayground {
    public static void main(String[] args) {
        int first = 10;
        int second = 5;
        int third = 2;

        int withoutParentheses = first + second * third;
        int withParentheses = (first + second) * third;

        System.out.println("withoutParentheses = " + withoutParentheses);
        System.out.println("withParentheses = " + withParentheses);
        System.out.println("integer division = " + (5 / 2));
        System.out.println("double division = " + (5.0 / 2));
    }
}

