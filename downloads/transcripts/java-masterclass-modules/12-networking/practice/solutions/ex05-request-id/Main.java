public class Main { public static boolean canRetry(String m,String k) { if(!m.matches("GET|PUT|DELETE")) return "POST".equals(m)&&k!=null&&!k.isBlank(); return true; } }
