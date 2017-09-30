package com.bdth.rure.base.controller;

import com.bdth.rure.base.api.UserService;
import com.bdth.rure.base.dao.modle.User;
import com.bdth.rure.base.dao.modle.UserExample;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

import javax.servlet.http.HttpSession;
import java.util.List;

/**
 * Created by Administrator on 2017/9/30.
 */
@Controller
public class LoginController {

    @Autowired
    private UserService userService;

    @RequestMapping("/login")
    public String login(HttpSession session, String usercode, String password) throws Exception{
        //调用service校验用户账号和密码的正确性
        //..
        UserExample userExample = new UserExample();
        userExample.createCriteria().andIdEqualTo("lisi");
        List<User> list = userService.selectByExample(userExample);
        for (User bean: list) {
            System.out.println(bean.toString());
            //如果service校验通过，将用户身份记录到session
            session.setAttribute("usercode", bean.getUsername());
        }

        //重定向到商品查询页面
        return "redirect:/index/main.action";
    }

    @RequestMapping("/index")
    public String index() throws Exception{
        System.out.println("login..........................page");
        return "login";
    }
}
