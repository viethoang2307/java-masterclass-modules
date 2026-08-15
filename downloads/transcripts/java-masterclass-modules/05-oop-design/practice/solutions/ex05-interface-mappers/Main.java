public class Main {
    interface Mappable { String map(); }
    static final class User implements Mappable {
        private final String name;
        User(String name) { if (name == null || name.isBlank()) throw new IllegalArgumentException(); this.name=name.strip(); }
        @Override public String map() { return "user:" + name; }
    }
    static final class Product implements Mappable {
        private final String name;
        Product(String name) { if (name == null || name.isBlank()) throw new IllegalArgumentException(); this.name=name.strip(); }
        @Override public String map() { return "product:" + name; }
    }
    static String mapAll(Mappable... values) {
        StringBuilder b=new StringBuilder();
        for(int i=0;i<values.length;i++){if(i>0)b.append('|');b.append(values[i].map());}
        return b.toString();
    }
    public static void main(String[] args) { System.out.println(mapAll(new User("An"),new Product("Book"))); }
}

