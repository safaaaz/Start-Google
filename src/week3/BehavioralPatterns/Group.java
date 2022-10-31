package week3.BehavioralPatterns;

import java.io.FileNotFoundException;
import java.io.IOException;

public class Group implements Concrete{
    private int id;
    private int size;
    @Override
    public void accept(Visitor visitor) throws IOException {
        visitor.visit(this);
    }

    public Group(int id, int size) {
        this.id = id;
        this.size = size;
    }
}
