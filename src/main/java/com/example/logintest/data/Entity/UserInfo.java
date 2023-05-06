package com.example.logintest.data.Entity;

import jakarta.persistence.*;
import jakarta.validation.constraints.Email;
import lombok.Getter;
import lombok.Setter;

@Entity
@Getter
@Setter
@Table(name = "userinfo")
public class UserInfo {
    @Id
    @Email
//    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private String username;
    @Column(nullable = false)
    private String password;

}
