package week2.Exceptions;

import com.google.gson.Gson;
import jdk.nashorn.internal.parser.JSONParser;

import java.io.*;
import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;

public class ReadFile {

    public static void main(String[] args) throws IOException {
        jasonToMap("safaa.json");
    }
    public static void jasonToMap(String fileName) throws IOException {
        try {
            if(fileName.length()<6) throw new IllegalArgumentException("File name must be more than 5 characters!");

            BufferedReader bufferedReader = new BufferedReader(new FileReader(fileName));
            Gson gson = new Gson();
            HashMap<String, String> json = gson.fromJson(bufferedReader, HashMap.class);

            String key = "model";
            if(json.get(key)==null) throw new RuntimeException("Config key '"+key+"' does not exists");

        } catch (FileNotFoundException e){
            try {
                Map<String, String> map = new HashMap<>();
                map.put("version", "19.0");
                map.put("type", "IntelliJ");
                map.put("roles", "no roles");

                Writer writer = new FileWriter(fileName);
                new Gson().toJson(map, writer);
                writer.close();
            }catch (Exception ex) {
                ex.printStackTrace();
            } 
        }
    }
}
