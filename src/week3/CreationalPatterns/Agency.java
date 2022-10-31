package week3.CreationalPatterns;

import java.util.concurrent.ThreadLocalRandom;

public class Agency {

    public Agency() {
    }

    public void assignVehicleToPassenger(Passenger passenger){
        VehicleType value=passenger.getFavoriteVehicle();
        if(value.count != 0){
            value.decreaseCount();
        }
        else{
            if(VehicleType.BUS.count == 0 &VehicleType.BOAT.count == 0 & VehicleType.TAXI.count == 0 & VehicleType.PLANE.count == 0){System.out.println("There is no vehicle to transport"); return;}
            value = VehicleType.values()[ThreadLocalRandom.current().nextInt(VehicleType.values().length - 1)];
            while(value.count==0){
                value = VehicleType.values()[ThreadLocalRandom.current().nextInt(VehicleType.values().length - 1)];
            };
            value.decreaseCount();
        }
        FactoryVehicle.createVehicle().getVehicle(value).transport(passenger);
    }
}
