package week3.CreationalPatterns;

public class Client {
    public static void main(String[] args) {
        Passenger pass= new Passenger("safaa",VehicleType.BUS);
        Agency a = new Agency();
        a.assignVehicleToPassenger(pass);
        a.assignVehicleToPassenger(new Passenger("saja",VehicleType.PLANE));
        a.assignVehicleToPassenger(new Passenger("sally",VehicleType.PLANE));

    }
}
