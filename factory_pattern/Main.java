package factory_pattern;

public class Main {

    public static void main(String[] args){
        
        VehicleFactory factory = new VehicleFactory();

        Vehicle vehicle = factory.getVehicle("Car");
        vehicle.drive();

    }
    
}
