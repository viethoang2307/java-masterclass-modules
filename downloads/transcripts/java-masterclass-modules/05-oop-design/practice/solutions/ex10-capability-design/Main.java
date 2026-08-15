public class Main {
    interface Device { String name(); }
    interface Chargeable { String charge(); }
    interface Trackable { String track(); }
    static final class Phone implements Device,Chargeable,Trackable {
        public String name(){return "phone";} public String charge(){return "charge";} public String track(){return "track";}
    }
    static final class Lamp implements Device,Chargeable {
        public String name(){return "lamp";} public String charge(){return "charge";}
    }
    static String report(Device... devices) {
        StringBuilder b=new StringBuilder();
        for(int i=0;i<devices.length;i++){if(i>0)b.append('|');Device d=devices[i];b.append(d.name()).append(':');boolean first=true;
            if(d instanceof Chargeable c){b.append(c.charge());first=false;}
            if(d instanceof Trackable t){if(!first)b.append(',');b.append(t.track());}}
        return b.toString();
    }
    public static void main(String[] args){System.out.println(report(new Phone(),new Lamp()));}
}

