package com.user.User.service;

import com.user.User.model.User;

import java.util.List;

public interface UserService {

    User getUserById(String userId);

    List<User> getAllUsers();

    User saveUser(User user);

    User updateUser(User user);


}
