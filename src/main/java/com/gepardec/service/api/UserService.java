package com.gepardec.service.api;

import com.gepardec.model.User;

public interface UserService {
    String getfullname(User user);

    String getUserById(int id);
}
