package factory_pattern;

public class VehicleFactory {

    public static Vehicle getVehicle(String type){
        if(type.equalsIgnoreCase("Car")){
            return new Car();
        } else if(type.equalsIgnoreCase("Bike")){
            return new Bike();
        } else{
            throw new IllegalArgumentException("Invalid vehicle type");
        }
    }
    
}
