package com.bisaha.cbd.service;

import com.bisaha.cbd.exception.AlreadyExistsException;
import com.bisaha.cbd.model.User;
import org.springframework.stereotype.Service;

import java.util.Optional;

@Service
public class RegisterService {

    private UserService userService;

    public RegisterService(UserService userService){
        this.userService = userService;
    }

    public User register(User user){
        Optional<User> anyUserByPhoneNumber = userService.getUserByPhoneNumber(user.getPhoneNumber());
        if(anyUserByPhoneNumber.isPresent()){
            throw new AlreadyExistsException("Phone number already exists");
        }

        Optional<User> anyUserByEmail = userService.getUserByEmail(user.getEmail());
        if(anyUserByEmail.isPresent()){
            throw new AlreadyExistsException("Email already exists");
        }

        userService.save(user);
        return user;
    }

}
