package com.bdth.rure.demo.rpc.api;


import com.bdth.rure.demo.dao.modle.DemoUser;

import java.util.List;

/**
 * Created by Administrator on 2017/9/8.
 */
public interface DemoUserService {

    DemoUser createUser(DemoUser bean);

    List<DemoUser> selectDemoUser();

}
