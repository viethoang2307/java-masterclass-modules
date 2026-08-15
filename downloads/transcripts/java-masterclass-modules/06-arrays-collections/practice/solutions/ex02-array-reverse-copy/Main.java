public class Main {
    static int[] reverseCopy(int[] input) {
        if (input == null) throw new IllegalArgumentException("input is null");
        int[] result = new int[input.length];
        for (int i = 0; i < input.length; i++) result[i] = input[input.length - 1 - i];
        return result;
    }
}
