package week2.classInterfaces;

public class Bird implements Animal{
    final private String gender;
    final private int id;
    final private double weight;
    public Bird(String gender, int id, double weight) {
        this.gender=gender;
        this.id=id;
        this.weight=weight;
    }

    @Override
    public void move() {
        System.out.println("bakk bakk bakk");
    }

    public Animal mate(Animal partner) {
        if(this.gender!=((Bird)partner).gender)
            return new Bird("male",123,2);
        return null;
    }
}
