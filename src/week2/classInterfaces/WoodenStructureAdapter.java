package week2.classInterfaces;

public class WoodenStructureAdapter implements Animal{
    WoodenHorse horse;

    public WoodenStructureAdapter(WoodenHorse horse) {
        this.horse = horse;
    }

    @Override
    public void move() {
        horse.roll();
    }

    @Override
    public Object mate(Animal partner) throws InstantiationException, IllegalAccessException {
        return horse.replicate();
    }
}
