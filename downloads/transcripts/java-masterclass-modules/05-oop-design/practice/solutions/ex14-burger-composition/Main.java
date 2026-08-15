public class Main {
    static final class Burger {
        private final long base; private final java.util.Map<String,Long> toppings=new java.util.LinkedHashMap<>();
        Burger(long base){if(base<0)throw new IllegalArgumentException();this.base=base;}
        boolean addTopping(String name,long cents){if(name==null||name.isBlank()||cents<0||toppings.containsKey(name.strip()))return false;toppings.put(name.strip(),cents);return true;}
        long totalCents(){long total=base;for(long cents:toppings.values())total+=cents;return total;}
        int toppingCount(){return toppings.size();}
    }
    public static void main(String[] args){Burger b=new Burger(500);b.addTopping("cheese",50);System.out.println(b.totalCents());}
}

