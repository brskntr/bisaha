package com.bisaha.cbd;


import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class HelloController {

    @GetMapping("")
    public String hello(){
        return "Hello bisaha app.";
    }

    @GetMapping("/second")
    public String helloSecond(){
        return "Hello Second controoler.";
    }
}
