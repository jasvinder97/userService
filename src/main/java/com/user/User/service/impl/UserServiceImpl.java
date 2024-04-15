package com.user.User.service.impl;

import com.user.User.entity.UserEntity;
import com.user.User.model.User;
import com.user.User.repository.UserRepository;
import com.user.User.service.UserService;
import lombok.extern.slf4j.Slf4j;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Map;
import java.util.stream.Collectors;

@Service
@Slf4j
public class UserServiceImpl implements UserService {

    @Autowired
    UserRepository userRepository;

    @Override
    public User getUserById(String userId) {
        UserEntity userEntity = userRepository.findById(userId).orElseThrow(() -> new RuntimeException("UserNotFound"));
        return getUser(userEntity);
    }

    public User getUser(UserEntity userEntity) {
        return User.builder()
                .userId(userEntity.getUserId())
                .address(userEntity.getAddress())
                .city(userEntity.getCity())
                .firstName(userEntity.getUserName())
                .lastName(userEntity.getLastName())
                .build();
    }

    public UserEntity getUserEntity(User user) {
        return UserEntity.builder()
                .userId(user.getUserId())
                .address(user.getAddress())
                .city(user.getCity())
                .userName(user.getFirstName())
                .lastName(user.getLastName())
                .build();
    }


    @Override
    public List<User> getAllUsers() {
        List<UserEntity> userEntityList = userRepository.findAll();
        return userEntityList.stream().map(this::getUser).collect(Collectors.toList());
    }

    public void map(List<User> userList) {

        Map<String, Long> map = userList.stream().collect(Collectors.groupingBy(User::getLastName, Collectors.counting()));
        System.out.println(map);
    }


    @Override
    public User saveUser(User user) {
        UserEntity userEntity = userRepository.saveAndFlush(getUserEntity(user));
        return getUser(userEntity);
    }


    @Override
    public User updateUser(User user) {
        return null;
    }
}
