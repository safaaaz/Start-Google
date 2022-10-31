package week1;

import java.util.HashMap;
import java.util.Map;

public class user {
    String Name;
    int Id;
    Boolean IsActivated;

    public static void main(String[] args) {
        Map<Integer, user> usersById = new HashMap<>();
        usersById.put(1,new user("safaa",1,true));
        usersById.put(2,new user(utility.RandomString(5),1,true));
        System.out.println(usersById.get(2).Name);
        int countActive=0;
        for (user u:usersById.values()) {
            if(u.IsActivated){
                countActive++;
            }
        }
        System.out.println(countActive+" from the users are activated");
    }
    public user(String name, int id, Boolean isActivated) {
        Name = name;
        Id = id;
        IsActivated = isActivated;
    }
}
