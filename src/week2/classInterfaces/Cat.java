package week2.classInterfaces;

public class Cat implements Animal{
    final private String gender;
    final private int id;
    final private double weight;
    public Cat(String gender, int id, double weight) {
        this.gender = gender;
        this.id = id;
        this.weight = weight;
    }

    @Override
    public void move() {
        System.out.println("mio mio mio");
    }

    public Animal mate(Animal partner) {
        if(this.gender!=((Cat)partner).gender)
            return new Cat("male",123,2);
        return null;
    }

}
