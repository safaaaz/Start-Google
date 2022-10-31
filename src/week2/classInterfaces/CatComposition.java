package week2.classInterfaces;

public class CatComposition {
    private Cat c;

    public void move(){
        c.move();
    }
    public Animal mate(Animal a){
        return c.mate(a);
    }
}
