package week3.BehavioralPatterns;

import java.io.FileNotFoundException;
import java.io.IOException;

public class User implements Concrete{
    private int id;
    private String name;
    private String password;
    @Override
    public void accept(Visitor visitor) throws IOException {
        visitor.visit(this);
    }

    public User(int id, String name, String password) {
        this.id = id;
        this.name = name;
        this.password = password;
    }
}
