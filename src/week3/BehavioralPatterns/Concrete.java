package week3.BehavioralPatterns;

import java.io.FileNotFoundException;
import java.io.IOException;

public interface Concrete {
    public void accept(Visitor visitor) throws IOException;
}
