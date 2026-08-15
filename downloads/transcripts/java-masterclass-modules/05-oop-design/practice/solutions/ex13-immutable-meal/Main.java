import java.util.List;
public class Main {
    static final class Meal {
        private final String id; private final List<String> items; private final long cents;
        Meal(String id,List<String> items,long cents){if(id==null||id.isBlank()||items==null||cents<0)throw new IllegalArgumentException();this.id=id.strip();this.items=List.copyOf(items);this.cents=cents;}
        String id(){return id;} List<String> items(){return items;} long cents(){return cents;} int totalItems(){return items.size();}
    }
    public static void main(String[] args){System.out.println(new Meal("M1",List.of("burger"),500).cents());}
}

