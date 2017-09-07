package com.bdth.common.test;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.stereotype.Service;

/**
 * Created by Administrator on 2017/9/7.
 */
@Service
public class TestService {

    private Logger logger = LoggerFactory.getLogger(TestService.class);


    public void addUser(String name){
        logger.info("add name "+name);
        System.out.println("TestService addUser: "+name);
    }
}
