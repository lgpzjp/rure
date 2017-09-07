package com.bdth.rure.demo.common.test;

import com.bdth.common.test.TestService;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;

/**
 * Created by Administrator on 2017/9/7.
 */
@RunWith(SpringJUnit4ClassRunner.class)
@ContextConfiguration(locations = {"/applicationContext-common.xml"})
public class App {
    @Autowired
    private TestService testService;

    @Test
    public void testAddUser(){
        testService.addUser("abc");
    }
}
