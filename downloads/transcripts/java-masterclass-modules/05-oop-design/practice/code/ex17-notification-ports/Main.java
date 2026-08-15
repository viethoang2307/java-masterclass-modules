public class Main {
    interface Sender { String send(String message); }
    static final class EmailSender implements Sender {
        // TODO
    }
    static final class SmsSender implements Sender {
        // TODO
    }
    static String sendAll(String message, Sender... senders) {
        // TODO
        return "TODO";
    }
    public static void main(String[] args){System.out.println("Implement ports");}
}

