package com.kobe.controller;

import com.kobe.service.BaseUserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;

import javax.servlet.http.HttpServletRequest;

@Controller
public class BaseUserController {

    @Autowired
    private BaseUserService baseUserService;


    @RequestMapping(value = "/login.do",method = RequestMethod.GET)
    public String testLogin(@RequestParam(value="username")String username, @RequestParam(value="password")String password, HttpServletRequest request) {
        //查询当前登录用户信息
        boolean flag = baseUserService.userLogin(username,password);
        if (flag) {
            return "loginSuccess";
        }else {
            return "loginError";

        }
    }
}
