public class Main {
    enum State { DRAFT, SUBMITTED, CANCELLED }
    static final class Order {
        private State state=State.DRAFT;
        private final java.util.List<String> items=new java.util.ArrayList<>();
        boolean addItem(String item){if(state!=State.DRAFT||item==null||item.isBlank())return false;items.add(item.strip());return true;}
        boolean submit(){if(state!=State.DRAFT||items.isEmpty())return false;state=State.SUBMITTED;return true;}
        boolean cancel(){if(state==State.CANCELLED)return false;state=State.CANCELLED;return true;}
        String report(){return state+":"+items.size();}
    }
    public static void main(String[] args){Order o=new Order();o.addItem("A");o.submit();System.out.println(o.report());}
}

