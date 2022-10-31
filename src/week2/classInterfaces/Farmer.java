package week2.classInterfaces;

import java.util.ArrayList;

public class Farmer {
    private ArrayList<Animal> animals;

    public Farmer(ArrayList<Animal> animals) {
        this.animals = animals;
    }

    public void moveAnimal(Animal a){
        a.move();
    }
    public void requestAnimal(farm f,Animal a){
        animals.add(f.provideToOutside(a));
    }
}
