package week2.classInterfaces;

public class WoodenHorse implements WoodenStructures{
    @Override
    public void roll() {
        System.out.println("Wooden horse is rolling!");
    }

    @Override
    public Object replicate() {
        System.out.println("Wooden horse is replicated");
        return this;
    }
}
