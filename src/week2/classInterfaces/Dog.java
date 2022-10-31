package week2.classInterfaces;

public class Dog implements Animal{
    final private String gender;
    final private int id;
    final private double weight;
    public Dog(String gender, int id, double weight) {
        this.gender=gender;
        this.id=id;
        this.weight=weight;
    }

    @Override
    public void move() {
        System.out.println("ho ho ho");
    }

    public Animal mate(Animal partner) {
        if(this.gender!=((Dog)partner).gender)
            return new Dog("male",123,2);
        return null;
    }
}
