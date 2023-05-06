package com.example.logintest.service.impl;

import com.example.logintest.data.DAO.UserInfoDAO;
import com.example.logintest.data.DTO.UserInfoDTO;
import com.example.logintest.data.Entity.UserInfo;
import com.example.logintest.data.repository.UserInfoRepository;
import com.example.logintest.service.AuthService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.Objects;

@Service
public class AuthServiceImpl implements AuthService {
    private final UserInfoDAO userInfoDAO;


    @Autowired
    public AuthServiceImpl(UserInfoDAO userInfoDAO) {
        this.userInfoDAO = userInfoDAO;

    }

    @Override
    public UserInfoDTO signUp(UserInfoDTO userInfoDTO) {
        UserInfo userInfo = new UserInfo();
        userInfo.setUsername(userInfoDTO.getUsername());
        userInfo.setPassword(userInfoDTO.getPassword());

        UserInfo savedUserInfo = userInfoDAO.insertUserInfo(userInfo);

        UserInfoDTO userInfoDTO1 = new UserInfoDTO();
        userInfoDTO1.setUsername(savedUserInfo.getUsername());
        userInfoDTO1.setPassword(savedUserInfo.getPassword());

        return userInfoDTO1;
    }

    @Override
    public UserInfoDTO signIn(UserInfoDTO userInfoDTO) {
//        UserInfo userInfo = new UserInfo();
//        userInfo.setUsername(userInfoDTO.getUsername());
//        userInfo.setPassword(userInfoDTO.getPassword());

        UserInfo savedUserInfo = userInfoDAO.selectUserInfo(userInfoDTO.getUsername());
        if (Objects.equals(savedUserInfo.getPassword(), userInfoDTO.getPassword())) {
            UserInfoDTO userInfoDTO1 = new UserInfoDTO();
            userInfoDTO1.setUsername(savedUserInfo.getUsername());
            userInfoDTO1.setPassword(savedUserInfo.getPassword());

            return userInfoDTO1;
        }
        else return userInfoDTO;
    }

    @Override
    public UserInfoDTO findPassword(String username) {
        UserInfo savedUserInfo = userInfoDAO.selectUserInfo(username);

        UserInfoDTO userInfoDTO1 = new UserInfoDTO();
        userInfoDTO1.setUsername(savedUserInfo.getUsername());
        userInfoDTO1.setPassword(savedUserInfo.getPassword());

        return userInfoDTO1;
    }
}
