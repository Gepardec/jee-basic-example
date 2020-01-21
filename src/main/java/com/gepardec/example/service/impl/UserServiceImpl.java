package com.gepardec.example.service.impl;

import com.gepardec.example.model.User;
import com.gepardec.example.service.api.UserService;

import javax.annotation.PostConstruct;
import javax.enterprise.context.RequestScoped;
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

        return client.target(URL_GET_USER).path(id.toString()).request(MediaType.APPLICATION_JSON).get(User.class);
    }

    @Override
    public String getFullUserName(User user) {

        if(user == null || user.getFirstName() == null || user.getLastName() == null) {
            return null;
        }

        return user.getFirstName() + " " + user.getLastName();
    }
}
