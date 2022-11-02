package week2.classInterfaces;

public class Client {
    public static void main(String[] args) {
        WoodenHorse horse = new WoodenHorse();
        WoodenStructureAdapter adapter = new WoodenStructureAdapter(horse);
        adapter.move();
    }
}
