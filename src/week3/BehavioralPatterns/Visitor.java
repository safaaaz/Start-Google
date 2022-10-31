package week3.BehavioralPatterns;

import java.io.FileNotFoundException;
import java.io.IOException;

public interface Visitor {
    void visit(Object oven) throws IOException;

}