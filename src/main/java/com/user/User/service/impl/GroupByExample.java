package com.user.User.service.impl;

import com.user.User.model.User;
import com.user.User.service.UserService;
import lombok.extern.slf4j.Slf4j;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Map;
import java.util.stream.Collectors;

@Service
@Slf4j
public class GroupByExample {

    @Autowired
    UserService userService;

    public void groupBy() {
        List<User> userList = userService.getAllUsers();
        Map<String, Long> map = userList.stream().collect(Collectors.groupingBy(User::getLastName, Collectors.counting()));
        System.out.println(map);
    }
}
