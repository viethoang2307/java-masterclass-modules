public class Main {
    static abstract class Shape { abstract double area(); }
    static final class Circle extends Shape { private final double r; Circle(double r){if(r<=0)throw new IllegalArgumentException();this.r=r;} @Override double area(){return Math.PI*r*r;} }
    static final class Square extends Shape { private final double side; Square(double side){if(side<=0)throw new IllegalArgumentException();this.side=side;} @Override double area(){return side*side;} }
    static Shape factory(String kind,double size) {
        if(kind==null)throw new IllegalArgumentException();
        return switch(kind.strip().toLowerCase(java.util.Locale.ROOT)){case "circle"->new Circle(size);case "square"->new Square(size);default->throw new IllegalArgumentException();};
    }
    static double areaReport(Shape... shapes){double total=0;for(Shape s:shapes)total+=s.area();return total;}
    public static void main(String[] args){System.out.println(areaReport(factory("circle",2)));}
}

