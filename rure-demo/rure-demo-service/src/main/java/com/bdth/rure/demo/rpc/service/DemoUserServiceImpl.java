package com.bdth.rure.demo.rpc.service;

import com.bdth.rure.demo.dao.mapper.DemoUserMapper;
import com.bdth.rure.demo.dao.modle.DemoUser;
import com.bdth.rure.demo.rpc.api.DemoUserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

/**
 * Created by Administrator on 2017/9/8.
 */
@Service
public class DemoUserServiceImpl  implements DemoUserService {

    @Autowired
    private DemoUserMapper demoUserMapper;

    public DemoUser createUser(DemoUser bean) {
        int id = demoUserMapper.insertDemoUser(bean);
        if(id!=0){
            bean.setId(id);
        }else{
            return null;
        }
        return bean;
    }

    public List<DemoUser> selectDemoUser(){
        return demoUserMapper.selectDemoUser();
    }
}
