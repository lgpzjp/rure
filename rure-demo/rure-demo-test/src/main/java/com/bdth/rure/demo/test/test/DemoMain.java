package com.bdth.rure.demo.test.test;

import com.bdth.common.util.MD5Util;
import com.bdth.common.util.StringUtil;
import com.bdth.rure.demo.dao.modle.DemoUser;
import com.bdth.rure.demo.rpc.api.DemoUserService;
import org.springframework.beans.factory.BeanFactory;
import org.springframework.context.support.ClassPathXmlApplicationContext;

/**
 * Created by Administrator on 2017/9/8.
 */
public class DemoMain {

    public static void main(String[] args) {
        DemoUser user = new DemoUser();
        user.setUsername("abc");
        user.setPassword(MD5Util.MD5("abc"));
        user.setSex(1);
        user.setCrtime(StringUtil.Date2String());

        String[] resources = new String[]{"classpath*:/spring-dubbo-consumer.xml"};
        BeanFactory factory = new ClassPathXmlApplicationContext(resources);
        DemoUserService demoUserService = (DemoUserService)factory.getBean("demoUserService");
        DemoUser result = demoUserService.createUser(user);
        System.out.println(result);
    }
}
