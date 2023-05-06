package com.example.logintest.data.repository;

import com.example.logintest.data.Entity.UserInfo;
import org.springframework.data.jpa.repository.JpaRepository;

public interface UserInfoRepository extends JpaRepository<UserInfo,String> {
UserInfo findByUsername(String username);
}
