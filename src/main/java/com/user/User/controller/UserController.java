package com.user.User.controller;

import com.user.User.model.User;
import com.user.User.service.UserService;
import lombok.extern.slf4j.Slf4j;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/user")
@Slf4j
public class UserController {

    @Autowired
    UserService userService;

    @GetMapping("/{id}")
    ResponseEntity<User> findUserById(@PathVariable(name = "id") String userId) {
        User user = userService.getUserById(userId);
        return ResponseEntity.status(HttpStatus.OK).body(user);
    }

    @PostMapping("/save")
    ResponseEntity<User> saveUser(@RequestBody User user) {
        User savedUser = userService.saveUser(user);
        return ResponseEntity.status(HttpStatus.OK).body(user);
    }
}
