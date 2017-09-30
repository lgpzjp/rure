package com.bdth.rure.demo.test.web;

import com.bdth.common.util.MD5Util;
import com.bdth.common.util.StringUtil;
import com.bdth.rure.demo.dao.modle.DemoUser;
import com.bdth.rure.demo.rpc.api.DemoUserService;
import org.codehaus.jackson.map.ObjectMapper;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;

import javax.annotation.Resource;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.File;
import java.io.FileOutputStream;
import java.io.ObjectOutputStream;
import java.util.HashMap;
import java.util.Map;

/**
 * Created by Administrator on 2017/9/8.
 */
@Controller
@RequestMapping("/app")
public class UserController {

    private Logger logger = LoggerFactory.getLogger(UserController.class);

    @Resource
    private DemoUserService demoUserService;

    @Autowired
    private ObjectMapper jsonMapper;

    @RequestMapping("/index")
    public String index(){
        int count = this.demoUserService.selectDemoUserCount();
        System.out.println(">>>>>.....................>>>"+count);
        return "index";
    }

    @RequestMapping("/save")
    public void save(HttpServletRequest request, HttpServletResponse response)
            throws Exception{
        String username = request.getParameter("username");
        String password = request.getParameter("password");
        System.out.println(request.getParameter("username"));
        response.setContentType("text/html;charset=UTF-8");
        Map result = new HashMap();
        DemoUser bean = new DemoUser();
        bean.setSex(1);
        bean.setUsername(username);
        bean.setPassword(MD5Util.MD5(password));
        bean.setCrtime(StringUtil.Date2String());
//        ObjectOutputStream oo = new ObjectOutputStream(new FileOutputStream(new File("E:/bean.txt")));
//        oo.writeObject(bean);
//        oo.close();
        DemoUser r = this.demoUserService.createUser(bean);
        result.put("success",true);
        result.put("data",r);
        response.getWriter().write(jsonMapper.writeValueAsString(result));
    }
}
