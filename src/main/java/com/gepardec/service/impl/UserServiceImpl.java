package com.gepardec.service.impl;

import com.gepardec.model.User;
import com.gepardec.service.api.UserService;

import javax.annotation.PostConstruct;
import javax.ws.rs.client.Client;
import javax.ws.rs.client.ClientBuilder;

public class UserServiceImpl implements UserService {

    private static final String URI = "https://reqres.in";
    Client client;

    @PostConstruct
    public void init() {
        client = ClientBuilder.newClient();
    }


    @Override
    public String getfullname(User user) {

        if(user == null || user.getFirstname()==null || user.getLasttname() == null) {
            return null;
        }
        return user.getFirstname()+" "+user.getLasttname();
    }

    @Override
    public String getUserById(int id) {
//TODO Complete client.target(URI)...
        client.target(URI).path("api/users/"+id);
        return null;
    }
}
