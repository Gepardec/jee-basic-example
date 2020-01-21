package com.gepardec.example.util;

import com.gepardec.example.model.User;

import javax.json.JsonArray;
import javax.json.JsonObject;

public class UserTransformer {

    public static User transformUser(JsonObject jsonObject) {
        User user = new User();

        JsonObject data = jsonObject.getJsonObject("data");

        user.setId(data.getInt("id"));
        user.setFirstName(data.getString("first_name"));
        user.setLastName(data.getString("last_name"));
        user.setEmail(data.getString("email"));
        user.setAvatar(data.getString("avatar"));

        return user;
    }
}
