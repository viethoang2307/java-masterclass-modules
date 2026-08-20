import java.util.*;public class Main{public static String add(List<String>l,String t){if(t==null||t.isBlank())throw new IllegalArgumentException();String v=t.trim();l.add(v);return l.size()+"|"+v;}}
