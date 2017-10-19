package com.bdth.rure.base.service.impl;

import com.bdth.rure.base.api.UserService;
import com.bdth.rure.base.dao.modle.User;
import com.bdth.rure.base.dao.modle.UserExample;
import com.bdth.rure.base.service.IUserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

/**
 * Created by Administrator on 2017/10/9.
 */
@Service
public class UserServiceImpl implements IUserService {

    @Autowired
    private UserService userService;


    @Override
    public List<User> getListByName(String name, String password) {
        UserExample userExample = new UserExample();
        userExample.createCriteria().andIdEqualTo(name);
        List<User> list = userService.selectByExample(userExample);
        return list;
    }
}
