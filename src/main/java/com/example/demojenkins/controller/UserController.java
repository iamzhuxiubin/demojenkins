package com.example.demojenkins.controller;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

/**
 * @author zxb 2022/2/1 0:18
 */
@RestController
@RequestMapping(path = "/user")
public class UserController {

    @RequestMapping(path = "/get",method = RequestMethod.GET)
    public String getUser() {
        return "hello";
    }

}
