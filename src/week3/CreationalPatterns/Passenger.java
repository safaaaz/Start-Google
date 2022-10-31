package week3.CreationalPatterns;

public class Passenger {
    private String name;
    private VehicleType favoriteVehicle;

    public Passenger(String name, VehicleType favoriteVehicle) {
        this.name = name;
        this.favoriteVehicle = favoriteVehicle;
    }

    public String getName() {
        return name;
    }

    public VehicleType getFavoriteVehicle() {
        return favoriteVehicle;
    }
}
