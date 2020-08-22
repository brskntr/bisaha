package com.bisaha.cbd;


import com.bisaha.cbd.model.User;
import com.bisaha.cbd.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
public class HelloController {

//    public HelloController(LogService logService){
//        this.logService = logService;
//    }



    @Autowired
    private UserService userService;

    @GetMapping("")
    public String hello(){
        return "Hello bisaha app.";
    }

    @GetMapping("/userList")
    public List<User> userList(){
        return userService.userList();
    }

    @GetMapping("/second")
    public String helloSecond(){
        return "Hello Second controoler.";
    }

}
