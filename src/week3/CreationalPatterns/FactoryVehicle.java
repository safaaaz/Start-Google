package week3.CreationalPatterns;

public class FactoryVehicle {
    public static FactoryVehicle instance=null;
    public static FactoryVehicle createVehicle(){
        if(instance==null)
            instance= new FactoryVehicle();
        return instance;
    }
    private FactoryVehicle(){}

    public Vehicle getVehicle(VehicleType type){
        switch (type){
            case BOAT:
                return new Boat();
            case BUS:
                return new Bus();
            case PLANE:
                return new Plane();
            case TAXI:
                return new Taxi();
            default:
                throw new IllegalArgumentException("Vehicle type not supported!");
        }
    }
}
