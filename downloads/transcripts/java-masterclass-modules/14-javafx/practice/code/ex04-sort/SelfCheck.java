import java.util.*;public class SelfCheck{public static void main(String[]a){if(!List.of("a","b").equals(Main.sort(List.of("b","a"))))throw new AssertionError();System.out.println("PASS");}}
