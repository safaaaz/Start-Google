package week3.BehavioralPatterns;

import java.io.FileNotFoundException;
import java.io.IOException;

public class Asset implements Concrete{
    private int serialNumber;
    private String owner;
    private double rating;
    @Override
    public void accept(Visitor visitor) throws IOException {
        visitor.visit(this);
    }

    public Asset(int serialNumber, String owner, double rating) {
        this.serialNumber = serialNumber;
        this.owner = owner;
        this.rating = rating;
    }
}
