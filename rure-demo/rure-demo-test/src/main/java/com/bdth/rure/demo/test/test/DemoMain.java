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
        String[] resources = new String[]{"classpath*:/spring-dubbo-consumer.xml"};
        BeanFactory factory = new ClassPathXmlApplicationContext(resources);
        DemoUserService demoUserService = (DemoUserService)factory.getBean("demoUserService");
        int result = demoUserService.selectDemoUserCount();
        System.out.println(result);
    }
}
