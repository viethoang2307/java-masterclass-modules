public class SelfCheck {
    public static void main(String[] args) {
        String expected = "byte=[-128,127];int=[-2147483648,2147483647];intBits=32";
        if (!expected.equals(Main.result())) {
            throw new AssertionError("Range mismatch: " + Main.result());
        }
        System.out.println("PASS - EX05");
    }
}

