package goit;

import com.google.gson.Gson;

public class Printer {
    public void printUserName(User user) {
        Gson gson = new Gson();
        String json = gson.toJson(user);
        System.out.println(json);
    }
}
