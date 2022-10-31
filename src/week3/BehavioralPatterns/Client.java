package week3.BehavioralPatterns;

import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;

public class Client {
    public static void main(String[] args) throws IOException {
        List<Concrete> concrete = new ArrayList<>();
        concrete.add(new User(1,"safaa","1234"));
        concrete.add(new Asset(23,"saja",2.0));
        concrete.add(new Group(3,20));

        JasonVisitor json = new JasonVisitor();
        for (Concrete con : concrete) {
            con.accept(json);
        }
    }
}
