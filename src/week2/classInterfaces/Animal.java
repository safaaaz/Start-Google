package week2.classInterfaces;

public interface Animal {
    public void move();
    public Object mate(Animal partner) throws InstantiationException, IllegalAccessException;

}

