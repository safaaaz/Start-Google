package week2.classInterfaces;

public abstract class AnimalAbs implements Animal {
    public String gender;
    public int id;
    public double weight;

    public static void main(String[] args) throws InstantiationException, IllegalAccessException {
        Dog d =new Dog("male",32,43);
        Cat c =new Cat("female",55,88);
        System.out.println();
    }


    public Object mate(Animal partner) throws InstantiationException, IllegalAccessException {
        Class c=this.getClass();
        return c.newInstance();
    }




}
