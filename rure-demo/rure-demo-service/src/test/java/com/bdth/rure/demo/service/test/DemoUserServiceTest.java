package com.bdth.rure.demo.service.test;

import com.bdth.common.util.MD5Util;
import com.bdth.common.util.StringUtil;
import com.bdth.rure.demo.dao.modle.DemoUser;
import com.bdth.rure.demo.rpc.api.DemoUserService;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.BeanFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.support.ClassPathXmlApplicationContext;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;

/**
 * Created by Administrator on 2017/9/8.
 */
@RunWith(SpringJUnit4ClassRunner.class)
@ContextConfiguration(locations = {"classpath*:/dubbo-consumer.xml" ,"classpath*:/META-INF/spring/applicationContext-jdbc.xml"})
public class DemoUserServiceTest {


    private DemoUserService demoUserService;

    @Test
    public void ceshi(){
        DemoUser user = new DemoUser();
        user.setUsername("abc");
        user.setPassword(MD5Util.MD5("abc"));
        user.setSex(1);
        user.setCrtime(StringUtil.Date2String());

        String[] resources = new String[]{"classpath*:/dubbo-consumer.xml"  ,"classpath*:/META-INF/spring/applicationContext-jdbc.xml"};
        BeanFactory factory = new ClassPathXmlApplicationContext(resources);
        demoUserService = (DemoUserService)factory.getBean("demoUserService");
        DemoUser result = demoUserService.createUser(user);
        System.out.println(result);
    }

    @Test
    public void testAllCount(){

    }
}
