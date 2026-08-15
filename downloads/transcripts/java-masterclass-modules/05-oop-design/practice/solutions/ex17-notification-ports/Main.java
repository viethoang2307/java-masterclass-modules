public class Main {
    interface Sender { String send(String message); }
    static final class EmailSender implements Sender {
        public String send(String message){return "email:"+message;}
    }
    static final class SmsSender implements Sender {
        public String send(String message){return "sms:"+message;}
    }
    static String sendAll(String message, Sender... senders) {
        if(message==null||message.isBlank())throw new IllegalArgumentException();
        StringBuilder b=new StringBuilder();
        for(int i=0;i<senders.length;i++){if(i>0)b.append('|');b.append(senders[i].send(message.strip()));}
        return b.toString();
    }
    public static void main(String[] args){System.out.println(sendAll("hi",new EmailSender(),new SmsSender()));}
}

