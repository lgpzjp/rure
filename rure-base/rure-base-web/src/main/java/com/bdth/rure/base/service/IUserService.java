package com.bdth.rure.base.service;

import com.bdth.rure.base.dao.modle.User;

import java.util.List;

/**
 * Created by Administrator on 2017/10/9.
 */
public interface IUserService {

    List<User> getListByName(String name, String password);
}
