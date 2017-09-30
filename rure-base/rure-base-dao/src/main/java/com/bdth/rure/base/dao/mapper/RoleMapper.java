package com.bdth.rure.base.dao.mapper;

import com.bdth.rure.base.dao.modle.Role;
import com.bdth.rure.base.dao.modle.RoleExample;
import java.util.List;

public interface RoleMapper {
    int deleteByPrimaryKey(String id);

    int insert(Role record);

    int insertSelective(Role record);

    List<Role> selectByExample(RoleExample example);

    Role selectByPrimaryKey(String id);

    int updateByPrimaryKeySelective(Role record);

    int updateByPrimaryKey(Role record);
}