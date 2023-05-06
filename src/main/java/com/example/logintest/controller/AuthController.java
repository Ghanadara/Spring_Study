package com.example.logintest.controller;

import com.example.logintest.data.DTO.UserInfoDTO;
import com.example.logintest.service.AuthService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.Map;

@RestController
@RequestMapping("api/v1")
public class AuthController {
    private final AuthService authService;

    @Autowired
    public AuthController(AuthService authService) {
        this.authService = authService;
    }

    @PostMapping(value = "/signup")
    public ResponseEntity<UserInfoDTO> signUp(@RequestBody UserInfoDTO userInfoDTO) {
        UserInfoDTO userInfoDTO1 = authService.signUp(userInfoDTO);
        return ResponseEntity.status(HttpStatus.OK).body(userInfoDTO1);
    }

    @PostMapping(value = "/signin")
    public ResponseEntity<UserInfoDTO> signIn(@RequestBody UserInfoDTO userInfoDTO) {
        UserInfoDTO userInfoDTO1 = authService.signIn(userInfoDTO);
        return ResponseEntity.status(HttpStatus.OK).body(userInfoDTO1);
    }

    @GetMapping(value = "/password")
    public String findPassword(@RequestParam String username) {
        UserInfoDTO userInfoDTO = authService.findPassword(username);
        return userInfoDTO.getPassword();

    }

//    @GetMapping(value = "/password")
//    public ResponseEntity<UserInfoDTO> findPassword(String username){
//        UserInfoDTO userInfoDTO1 = authService.findPassword(username);
//        return ResponseEntity.status(HttpStatus.OK).body(userInfoDTO1);
//    }

}
