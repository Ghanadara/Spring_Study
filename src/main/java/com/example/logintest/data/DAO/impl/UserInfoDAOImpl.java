package com.example.logintest.data.DAO.impl;

import com.example.logintest.data.DAO.UserInfoDAO;
import com.example.logintest.data.Entity.UserInfo;
import com.example.logintest.data.repository.UserInfoRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

@Component
public class UserInfoDAOImpl implements UserInfoDAO {
    private final UserInfoRepository userInfoRepository;

    @Autowired
    public UserInfoDAOImpl(UserInfoRepository userInfoRepository){
        this.userInfoRepository = userInfoRepository;
    }

    @Override
    public UserInfo insertUserInfo(UserInfo userInfo) {
        UserInfo savedUserInfo = userInfoRepository.save(userInfo);
        return savedUserInfo;
    }

    @Override
    public UserInfo selectUserInfo(String username) {
        UserInfo selectedUserInfo = userInfoRepository.findByUsername(username);
        return selectedUserInfo;
    }

    @Override
    public UserInfo updateUserInfo(UserInfo userInfo) {
        return null;
    }

    @Override
    public void deleteUserInfo(UserInfo userInfo) {

    }
//    @Override
//    public UserInfo signIn(UserInfo userInfo){
//        UserInfo savedUserInfo = userInfoRepository.save(userInfo);
//        return savedUserInfo;
//    }
//
//    @Override
//    public UserInfo signUp(UserInfo userInfo) {
//        UserInfo savedUserInfo1 = userInfoRepository.save(userInfo);
//        return savedUserInfo1;
//    }
//
//    @Override
//    public UserInfo findPassword(String username) {
////        UserInfo getUserInfo = userInfoRepository.getReferenceById()
//        return null;
//    }
}
