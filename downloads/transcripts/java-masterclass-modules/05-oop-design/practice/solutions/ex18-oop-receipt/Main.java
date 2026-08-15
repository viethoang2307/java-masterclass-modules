import java.util.List;
public class Main {
    record Line(String label,long cents) {
        public Line{if(label==null||label.isBlank()||cents<0)throw new IllegalArgumentException();label=label.strip();}
    }
    static final class Receipt {
        private final List<Line> lines;
        Receipt(List<Line> lines){if(lines==null)throw new IllegalArgumentException();this.lines=List.copyOf(lines);}
        long total(){long t=0;for(Line line:lines)t+=line.cents();return t;}
        String render(){StringBuilder b=new StringBuilder();for(int i=0;i<lines.size();i++){if(i>0)b.append('\n');Line l=lines.get(i);b.append(l.label()).append('=').append(l.cents());}if(!lines.isEmpty())b.append('\n');return b.append("TOTAL=").append(total()).toString();}
    }
    public static void main(String[] args){System.out.println(new Receipt(List.of(new Line("book",100))).render());}
}

