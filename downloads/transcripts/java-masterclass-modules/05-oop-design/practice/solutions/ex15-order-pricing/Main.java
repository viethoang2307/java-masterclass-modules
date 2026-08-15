public class Main {
    interface LineItem { String label(); long price(); }
    static final class ProductItem implements LineItem {
        private final String label;private final long price;
        ProductItem(String label,long price){if(label==null||label.isBlank()||price<0)throw new IllegalArgumentException();this.label=label.strip();this.price=price;}
        public String label(){return label;}public long price(){return price;}
    }
    static final class DiscountItem implements LineItem {
        private final String label;private final long amount;
        DiscountItem(String label,long amount){if(label==null||label.isBlank()||amount<0)throw new IllegalArgumentException();this.label=label.strip();this.amount=amount;}
        public String label(){return label;}public long price(){return -amount;}
    }
    static final class Order {
        private final java.util.List<LineItem> items=new java.util.ArrayList<>();
        void add(LineItem item){if(item==null)throw new IllegalArgumentException();items.add(item);}
        long total(){long total=0;for(LineItem item:items)total+=item.price();return total;}
        int size(){return items.size();}
    }
    static String labels(LineItem... items){StringBuilder b=new StringBuilder();for(int i=0;i<items.length;i++){if(i>0)b.append('|');b.append(items[i].label());}return b.toString();}
    public static void main(String[] args){System.out.println(labels(new ProductItem("book",100)));}
}

