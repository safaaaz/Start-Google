package week2.LamdasStreams;

import java.time.LocalDate;

public class Item implements Comparable<Item>{
    private final String name;
    private final PRODUCTTYPE type;
    private final LocalDate expirationDate;
    private final double weight;

    public Item(String name, PRODUCTTYPE type, LocalDate expirationDate, double weight) {
        this.name = name;
        this.type = type;
        this.expirationDate = expirationDate;
        this.weight = weight;
    }

    public String getName() {
        return name;
    }

    public PRODUCTTYPE getType() {
        return type;
    }

    public LocalDate getExpirationDate() {
        return expirationDate;
    }

    public double getWeight() {
        return weight;
    }

    @Override
    public int compareTo(Item o) {
        if(this.expirationDate.isBefore(o.expirationDate))
            return -1;
        if (this.expirationDate.isEqual(o.expirationDate))
            return 0;
        return 1;
    }

    @Override
    public String toString() {
        return "Item{" +
                "name='" + name + '\'' +
                ", type=" + type +
                ", expirationDate=" + expirationDate +
                ", weight=" + weight +
                '}';
    }
}
