import java.net.URI;
public class Main { public static boolean valid(String value) { try { URI u=URI.create(value); return "https".equalsIgnoreCase(u.getScheme()) && u.getHost()!=null && !u.getHost().isBlank(); } catch (IllegalArgumentException e) { return false; } } }
