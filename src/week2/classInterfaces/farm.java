package week2.classInterfaces;

import java.rmi.activation.Activator;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collection;

public class farm {
    private ArrayList<Animal> animals;

    public static void main(String[] args) {
        farm f =new farm(new ArrayList<Animal>());
        f.animals.add(new Cat("male",34,23));
        f.animals.add(new Dog("female",34,23));
        f.animals.add(new Bird("female",79,81));
    }

    public farm(ArrayList<Animal> animals) {
        this.animals = animals;
    }

    public void acquire(Class s){
        animals.add(new Dog("newDog",14,2));
    }
    public void mateAnimals(int index1,int index2) throws InstantiationException, IllegalAccessException {
        animals.add((Animal) animals.get(index1).mate(animals.get(index2)));
    }
    public Animal provideToOutside(Animal a){
        animals.remove(animals.indexOf(a));
        return a;
    }
}
