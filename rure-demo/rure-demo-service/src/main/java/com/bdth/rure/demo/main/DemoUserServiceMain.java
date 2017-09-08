package com.bdth.rure.demo.main;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import java.util.Scanner;

/**
 * Created by Administrator on 2017/9/8.
 */
public class DemoUserServiceMain {

    private static Logger _log = LoggerFactory.getLogger(DemoUserServiceMain.class);

    public static void main(String[] args) throws Exception {
        _log.info(">>>>> rure-demo-rpc-service 正在启动 <<<<<");
        new ClassPathXmlApplicationContext(new String[]{"classpath*:/applicationContext-*.xml", "classpath*:/META-INF/spring/applicationContext-*.xml"});
        _log.info(">>>>> rure-demo-rpc-service 启动完成 <<<<<");
        Scanner s=new Scanner(System.in);
        String x=s.next();

        while(!(x.equals("Q"))){
            x=s.next();
        }

    }

}
