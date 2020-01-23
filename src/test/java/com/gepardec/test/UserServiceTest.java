package com.gepardec.test;

import com.gepardec.model.User;
import com.gepardec.service.api.UserService;
import com.gepardec.service.impl.UserServiceImpl;
import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertNull;

public class UserServiceTest {

    UserService userservice;
    @Before
    public void init() {
        userservice = new UserServiceImpl();
    }

    @Test
    public void testGetFullName() {
        User user = new User();

        user.setFirstname("Max");
        user.setLasttname("Mustermann");

        String fullname= userservice.getfullname(user);

        assertEquals("Max Mustermann", fullname);
    }

    @Test
    public void testNullUser() {
        String fullname = userservice.getfullname(null);
        assertNull(fullname);
    }

    @Test
    public void testNullName() {
        User user = new User();
        String fullname = userservice.getfullname(user);
        assertNull(fullname);
    }
}
