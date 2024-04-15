package com.user.User.model;


import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

@NoArgsConstructor
@AllArgsConstructor
@Data
@Builder
public class User {
    private Integer userId;
    private String firstName;
    private String lastName;
    private String address;
    private String city;

}
