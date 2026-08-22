import java.util.*;public class SelfCheck{public static void main(String[]a){if(!List.of("b").equals(Main.refresh(List.of("a"),List.of("b"))))throw new AssertionError();System.out.println("PASS");}}
