package com.bdth.rure.base.controller;

import com.bdth.rure.base.dao.modle.User;
import com.bdth.rure.base.exception.CustomException;
import com.bdth.rure.base.service.IUserService;
import org.apache.shiro.authc.IncorrectCredentialsException;
import org.apache.shiro.authc.UnknownAccountException;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpSession;
import java.util.List;

/**
 * Created by Administrator on 2017/9/30.
 */
@Controller
public class LoginController {

    @Autowired
    private IUserService userService;

    @RequestMapping(value = "/login", method = RequestMethod.GET)
    public String login() throws Exception {
        return "login";
    }

    @RequestMapping(value = "/login", method = RequestMethod.POST)
    public String login(HttpServletRequest request) throws Exception{

        String exceptionClassName = (String) request.getAttribute("shiroLoginFailure");
        if(exceptionClassName!=null){
            if(UnknownAccountException.class.getName().equals(exceptionClassName)) {
                throw new CustomException("用户名不存在！");
            } else if(IncorrectCredentialsException.class.getName().equals(exceptionClassName)) {
                throw new CustomException("用户名或密码错误");
            } else {
                throw new Exception();
            }
        }
        return "login";
    }

}
