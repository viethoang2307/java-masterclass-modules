public class Main {
    static class Vehicle {
        private final String model;
        Vehicle(String model){if(model==null||model.isBlank())throw new IllegalArgumentException();this.model=model.strip();}
        String model(){return model;}
    }
    static final class ElectricVehicle extends Vehicle {
        ElectricVehicle(String model){super(model);}
        String charge(){return "charge";}
    }
    static String describe(Vehicle vehicle) {
        if(vehicle==null)throw new IllegalArgumentException();
        if(vehicle instanceof ElectricVehicle electric)return vehicle.model()+":"+electric.charge();
        return vehicle.model();
    }
    public static void main(String[] args){System.out.println(describe(new ElectricVehicle("E1")));}
}

