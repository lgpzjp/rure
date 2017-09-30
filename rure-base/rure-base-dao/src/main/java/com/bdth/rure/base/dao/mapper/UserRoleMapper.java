package com.bdth.rure.base.dao.mapper;

import com.bdth.rure.base.dao.modle.UserRole;
import com.bdth.rure.base.dao.modle.UserRoleExample;
import java.util.List;

public interface UserRoleMapper {
    int deleteByPrimaryKey(String id);

    int insert(UserRole record);

    int insertSelective(UserRole record);

    List<UserRole> selectByExample(UserRoleExample example);

    UserRole selectByPrimaryKey(String id);

    int updateByPrimaryKeySelective(UserRole record);

    int updateByPrimaryKey(UserRole record);
}