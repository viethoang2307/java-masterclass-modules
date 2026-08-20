public class Main { public static boolean allowed(String n) { if(n==null) return false; return switch(n.toLowerCase()) { case "accept","content-type","x-request-id" -> true; default -> false; }; } }
