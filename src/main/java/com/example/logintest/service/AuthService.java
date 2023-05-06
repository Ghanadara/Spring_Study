package com.example.logintest.service;

import com.example.logintest.data.DTO.UserInfoDTO;

public interface AuthService {
    UserInfoDTO signUp(UserInfoDTO userInfoDTO);
    UserInfoDTO signIn(UserInfoDTO userInfoDTO);
    UserInfoDTO findPassword(String username);
}
