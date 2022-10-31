package week3.BehavioralPatterns;

import com.google.gson.Gson;

import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;

public class JasonVisitor implements Visitor{
    Gson gson;
    FileOutputStream fileOut;
    public JasonVisitor() throws FileNotFoundException {
        this.gson = new Gson();
        fileOut = new FileOutputStream("./safaa.json");
    }

    @Override
    public void visit(Object object) throws IOException {
        fileOut.write(gson.toJson(object).getBytes());
    }
}
