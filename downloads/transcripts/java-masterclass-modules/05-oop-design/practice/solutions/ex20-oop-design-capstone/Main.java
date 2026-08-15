public class Main {
    interface Discount { long apply(long cents); }
    static final class TenPercent implements Discount { public long apply(long cents){return cents*90/100;} }
    static final class Product {
        private final String sku;private final long cents;
        Product(String sku,long cents){if(sku==null||sku.isBlank()||cents<0)throw new IllegalArgumentException();this.sku=sku.strip();this.cents=cents;}
        String sku(){return sku;}long cents(){return cents;}
    }
    static final class Catalog {
        private final java.util.Map<String,Product> products=new java.util.HashMap<>();
        void add(Product p){if(p==null)throw new IllegalArgumentException();products.put(p.sku(),p);}
        Product find(String sku){return products.get(sku);}
    }
    static final class Order {
        private final java.util.List<Product> items=new java.util.ArrayList<>();
        boolean buy(Product p){if(p==null)return false;items.add(p);return true;}
        int size(){return items.size();}long subtotal(){long t=0;for(Product p:items)t+=p.cents();return t;}
        long total(Discount d){if(d==null)throw new IllegalArgumentException();return d.apply(subtotal());}
    }
    static String capstone(){
        Catalog c=new Catalog();c.add(new Product("A",1000));c.add(new Product("B",2500));
        Order o=new Order();o.buy(c.find("A"));o.buy(c.find("B"));o.buy(c.find("A"));
        return "items="+o.size()+";subtotal="+o.subtotal()+";total="+o.total(new TenPercent());
    }
    public static void main(String[] args){System.out.println(capstone());}
}

