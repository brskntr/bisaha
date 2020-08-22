package com.bisaha.cbd.service;

import com.bisaha.cbd.model.User;
import com.bisaha.cbd.repository.UserRepository;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
public class UserService {


    private UserRepository userRepository;
    public UserService(UserRepository userRepository){
        this.userRepository = userRepository;
    }

    public void save(User user){
        userRepository.save(user);
    }

    public List<User> userList(){
        List<User> users = userRepository.findAll();
        return users;
    }

    public Optional<User> getUserByEmail(String email){
        return userRepository.findByEmail(email);
    }

    public Optional<User> getUserByPhoneNumber(String phoneNumber){
        return userRepository.findByPhoneNumber(phoneNumber);
    }

}
