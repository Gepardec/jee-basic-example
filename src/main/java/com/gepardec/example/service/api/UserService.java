package com.gepardec.example.service.api;

import com.gepardec.example.model.User;

public interface UserService {
    String getFullUserNameById(Integer id);

    User getUserById(Integer id);

    String getFullUserName(User user);
}
