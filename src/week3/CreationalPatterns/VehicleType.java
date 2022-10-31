package week3.CreationalPatterns;

public enum VehicleType {
    BOAT(3),BUS(4),PLANE(1),TAXI(8);

    VehicleType(int count){
        this.count=count;
    }
    public int count;
    public void decreaseCount(){
        count-=1;
    };
}


