public class Main {
    static abstract class Product {
        private final String name;
        Product(String name){if(name==null||name.isBlank())throw new IllegalArgumentException();this.name=name.strip();}
        String name(){return name;}
        abstract long cents();
    }
    static final class Book extends Product {
        private final long base;
        Book(String name,long base){super(name);if(base<0)throw new IllegalArgumentException();this.base=base;}
        @Override long cents(){return base;}
    }
    static final class Digital extends Product {
        private final long base;
        Digital(String name,long base){super(name);if(base<0)throw new IllegalArgumentException();this.base=base;}
        @Override long cents(){return base*80/100;}
    }
    static long total(Product... products){long total=0;for(Product p:products)total+=p.cents();return total;}
    public static void main(String[] args){System.out.println(total(new Book("Java",1000),new Digital("Video",2000)));}
}

