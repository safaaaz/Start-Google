package week1;

import java.util.List;
import java.util.Set;

public class NameGenerator {
    private final List<String> names;
    public NameGenerator(List<String> names){
        this.names=names;
    };
    public List<String> getNames(){return names;}
}
