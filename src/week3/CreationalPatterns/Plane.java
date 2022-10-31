package week3.CreationalPatterns;

public class Plane implements Vehicle{
    @Override
    public void transport(Passenger passenger) {
        System.out.println("successful transport for "+passenger.getName() + " by plane");
    }
}
