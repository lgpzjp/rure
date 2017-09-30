package com.bdth.rure.base.dao.mapper;

import com.bdth.rure.base.dao.modle.User;
import com.bdth.rure.base.dao.modle.UserExample;
import java.util.List;

public interface UserMapper {
    int deleteByPrimaryKey(String id);

    int insert(User record);

    int insertSelective(User record);

    List<User> selectByExample(UserExample example);

    User selectByPrimaryKey(String id);

    int updateByPrimaryKeySelective(User record);

    int updateByPrimaryKey(User record);
}