package com.gepardec.example;

import static org.junit.Assert.*;
import com.gepardec.example.model.User;
import com.gepardec.example.service.api.UserService;
import com.gepardec.example.service.impl.UserServiceImpl;
import org.junit.Before;
import org.junit.Test;

public class UserServiceTest {

    private UserService service;

    @Before
    public void init() {
        service = new UserServiceImpl();
    }

    @Test
    public void testGetFullUserName() {
        User user = new User();

        user.setFirstName("Julian");
        user.setLastName("Gartner");

        String fullName = service.getFullUserName(user);

        assertEquals("Julian Gartner", fullName);
    }
}
