package com.starfall.controller;

import com.starfall.Application;
import com.starfall.dao.UserDao;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

import javax.servlet.http.HttpSession;

@Controller
@SpringBootApplication(scanBasePackageClasses = Application.class)
public class HelloController {
    @Autowired
    private UserDao userDao;
    @RequestMapping("/")
    public String hello(
            HttpSession session
    ){

        session.setAttribute("user",userDao.findAll());
        return "index";
    }

}
