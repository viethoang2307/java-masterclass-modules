public class SelfCheck{public static void main(String[]a){if(!"todos.json.tmp".equals(Main.tempPath("todos.json")))throw new AssertionError();System.out.println("PASS");}}
