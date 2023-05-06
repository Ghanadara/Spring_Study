package com.example.logintest.data.DAO;

import com.example.logintest.data.Entity.UserInfo;

public interface UserInfoDAO {
//    UserInfo signIn(UserInfo userInfo);
//
//    UserInfo signUp(UserInfo userInfo);
//
//    UserInfo findPassword(String username);
//
    UserInfo insertUserInfo(UserInfo userInfo);
    UserInfo selectUserInfo(String username);

    UserInfo updateUserInfo(UserInfo userInfo);
    void deleteUserInfo(UserInfo userInfo);

}
