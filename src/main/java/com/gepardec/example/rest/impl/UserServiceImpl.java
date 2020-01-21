package com.gepardec.example.rest.impl;

import com.gepardec.example.model.User;
import com.gepardec.example.rest.api.UserService;
import com.gepardec.example.util.UserTransformer;

import javax.annotation.PostConstruct;
import javax.enterprise.context.RequestScoped;
import javax.json.JsonObject;
import javax.ws.rs.client.Client;
import javax.ws.rs.client.ClientBuilder;
import javax.ws.rs.core.MediaType;

@RequestScoped
public class UserServiceImpl implements UserService {

    private static final String URL_GET_USER = "https://reqres.in/api/users";

    private Client client;

    @PostConstruct
    private void init() {
        this.client = ClientBuilder.newClient();
    }


    @Override
    public String getFullUserNameById(Integer id) {
        return getFullUserName(getUserById(id));
    }

    @Override
    public User getUserById(Integer id) {
        if(id == null) {
            return null;
        }

        JsonObject response = client.target(URL_GET_USER).path(id.toString()).request(MediaType.APPLICATION_JSON).get(JsonObject.class);

        return UserTransformer.transformUser(response);
    }

    @Override
    public String getFullUserName(User user) {

        if(user == null || user.getFirstName() == null || user.getLastName() == null) {
            return null;
        }

        return user.getFirstName() + " " + user.getLastName();
    }
}
