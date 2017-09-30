package com.bdth.rure.base.rpc;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.context.support.ClassPathXmlApplicationContext;

/**
 * Created by Administrator on 2017/9/30.
 */
public class BaseApp {
    private static Logger _log = LoggerFactory.getLogger(BaseApp.class);

    public static void main(String[] args) {
        _log.info(">>>>> rure-base-rpc-service 正在启动 <<<<<");
        new ClassPathXmlApplicationContext("classpath:spring/*.xml");
        _log.info(">>>>> rure-base-rpc-service 启动完成 <<<<<");
    }
}
