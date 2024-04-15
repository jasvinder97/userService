package com.user.User.entity;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import jakarta.persistence.Table;
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

@Entity
@NoArgsConstructor
@AllArgsConstructor
@Data
@Builder
@Table(name = "USERS")
public class UserEntity {

    @Id
    @Column(name = "USER_ID")
    private Integer userId;

    @Column(name = "LAST_NAME")
    private String userName;
    @Column(name = "FIRST_NAME")
    private String lastName;
    @Column(name = "ADDRESS")
    private String address;
    @Column(name = "CITY")
    private String city;
}
