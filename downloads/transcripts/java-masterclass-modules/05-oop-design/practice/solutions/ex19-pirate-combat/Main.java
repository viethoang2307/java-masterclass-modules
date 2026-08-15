public class Main {
    interface Combatant { String name(); int attack(); boolean alive(); void takeDamage(int amount); }
    static final class Pirate implements Combatant {
        private final String name;private final int attack;private int health;
        Pirate(String name,int attack,int health){if(name==null||name.isBlank()||attack<=0||health<=0)throw new IllegalArgumentException();this.name=name.strip();this.attack=attack;this.health=health;}
        public String name(){return name;}public int attack(){return attack;}public boolean alive(){return health>0;}
        public void takeDamage(int amount){if(amount<0)throw new IllegalArgumentException();health=Math.max(0,health-amount);}
    }
    static String fight(Pirate first,Pirate second){
        if(first==null||second==null||first==second)throw new IllegalArgumentException();
        while(first.alive()&&second.alive()){second.takeDamage(first.attack());if(second.alive())first.takeDamage(second.attack());}
        return first.alive()?first.name():second.name();
    }
    public static void main(String[] args){System.out.println(fight(new Pirate("A",10,30),new Pirate("B",3,25)));}
}

