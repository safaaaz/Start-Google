package week3.StructuralPatterns;

import java.io.IOException;

public class Client {
    public static void main(String[] args) throws IOException {
        HttpRequests http = new HttpRequests();
        http.get();
        http.sendPOST();
        http.patch();
        http.delete();
    }
}
