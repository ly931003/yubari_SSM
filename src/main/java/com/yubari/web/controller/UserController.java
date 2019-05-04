package com.yubari.web.controller;

import com.yubari.domain.User;
import com.yubari.service.IItemsService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
@RequestMapping("/user")
public class UserController {



    @RequestMapping("/list")
    public String list() {
        return "/user/userlist";
    }

    @RequestMapping("/register")
    public String register(User user) {
        System.out.println(user);
        return "/user/userlist";
    }

    @RequestMapping("/toRegister")
    public String toRegister() {
        return "/user/register";
    }

}
