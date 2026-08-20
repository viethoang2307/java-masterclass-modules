public class Main {
    public static String map(long id, String email, Long discount) {
        return id + ":" + email + ":" + (discount == null ? "NONE" : discount);
    }
}
