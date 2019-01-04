package com.lynn.springboot.controller;


import com.lynn.springboot.datamodel.User;
import com.lynn.springboot.db.UserRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

/**
 * Created by eligshn on 2018/12/6.
 */
@RestController
public class HelloWorldController {
    @Autowired
    private UserRepository userRepository;

    @RequestMapping("/hello")
    public String index() {
        return "Hello World";
    }

    @RequestMapping("/list")
    public List<User> list() {
        return userRepository.findAll();
    }

 }

