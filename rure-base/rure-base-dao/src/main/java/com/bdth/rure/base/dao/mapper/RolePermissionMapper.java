package com.bdth.rure.base.dao.mapper;

import com.bdth.rure.base.dao.modle.RolePermission;
import com.bdth.rure.base.dao.modle.RolePermissionExample;
import java.util.List;

public interface RolePermissionMapper {
    int deleteByPrimaryKey(String id);

    int insert(RolePermission record);

    int insertSelective(RolePermission record);

    List<RolePermission> selectByExample(RolePermissionExample example);

    RolePermission selectByPrimaryKey(String id);

    int updateByPrimaryKeySelective(RolePermission record);

    int updateByPrimaryKey(RolePermission record);
}