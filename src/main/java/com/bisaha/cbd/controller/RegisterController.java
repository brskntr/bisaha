package com.bisaha.cbd.controller;

import com.bisaha.cbd.dto.UserDto;
import com.bisaha.cbd.mapper.UserMapper;
import com.bisaha.cbd.model.User;
import com.bisaha.cbd.service.RegisterService;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/v1")
public class RegisterController {

    private RegisterService registerService;
    private UserMapper userMapper;

    public RegisterController(RegisterService registerService,UserMapper userMapper){
        this.registerService = registerService;
        this.userMapper = userMapper;
    }

    @PostMapping("/register")
    public User register(@RequestBody UserDto userDto){
        return registerService.register(userMapper.convertToEntity(userDto));
    }

}
