package com.yubari.web.controller;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;

import javax.servlet.http.HttpServletRequest;

@Controller
public class LoginController {
    @RequestMapping("/login")
    public String login(String username, String password, HttpServletRequest request) {
        if ("Lian".equals(username) && "123456".equals(password)) {
            request.getSession().setAttribute("user", username);
            return "/main";
        }
        return "/login";
    }
}
