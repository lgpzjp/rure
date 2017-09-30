package com.bdth.rure.demo.dao.mapper;

import com.bdth.rure.demo.dao.modle.DemoUser;

import java.util.List;

/**
 * Created by Administrator on 2017/9/8.
 */
public interface DemoUserMapper {

    void insertDemoUser(DemoUser bean);

    List<DemoUser> selectDemoUser();

    int selectDemoUserCount();
}
