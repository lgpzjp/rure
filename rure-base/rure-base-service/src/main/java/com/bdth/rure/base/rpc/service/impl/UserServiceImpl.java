package com.bdth.rure.base.rpc.service.impl;

import com.bdth.common.annotation.BaseService;
import com.bdth.common.base.BaseServiceImpl;
import com.bdth.rure.base.api.UserService;
import com.bdth.rure.base.dao.mapper.UserMapper;
import com.bdth.rure.base.dao.modle.User;
import com.bdth.rure.base.dao.modle.UserExample;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

/**
 * Created by Administrator on 2017/9/30.
 */
@Service
@BaseService
public class UserServiceImpl extends BaseServiceImpl<UserMapper,User,UserExample> implements UserService{

    private static Logger _log = LoggerFactory.getLogger(UserServiceImpl.class);

    @Autowired
    private UserMapper userMapper;
}
