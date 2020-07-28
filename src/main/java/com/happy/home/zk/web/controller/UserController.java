package com.happy.home.zk.web.controller;

import com.happy.home.zk.web.feign.UserInterface;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import javax.annotation.Resource;

/**
 * @author: lijixiao
 * @date: 2020-07-28
 */
@RestController
@RequestMapping("/user")
public class UserController {

    @Resource
    private UserInterface user;

    @GetMapping
    public String getUser(){
        return user.getUser();
    }
}
