package com.bisaha.cbd.service;

import com.bisaha.cbd.dto.UserDto;
import com.bisaha.cbd.exception.InvalidCredentialsException;
import com.bisaha.cbd.model.User;
import org.springframework.stereotype.Service;

import java.util.Optional;

@Service
public class LoginService {

    private UserService userService;
    public LoginService(UserService userService){
        this.userService = userService;
    }

    public User login(UserDto userDto){
        Optional<User> userByPhoneNumber = userService.getUserByPhoneNumber(userDto.getPhoneNumber());
        if(!userByPhoneNumber.isPresent()){
            throw new InvalidCredentialsException("Invalid Credentials");
        }

        return userByPhoneNumber.get();

    }
}
