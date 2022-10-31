package week1;

import java.util.Random;

public class utility {
    public static String RandomString(int count){
        String chars = "abcdefghijklmnopqrstuvwxyz";
        Random rnd = new Random();
        StringBuilder sb = new StringBuilder(count);
        for (int i = 0; i < count; i++)
            sb.append(chars.charAt(rnd.nextInt(chars.length())));
        return sb.toString();
    }
}
