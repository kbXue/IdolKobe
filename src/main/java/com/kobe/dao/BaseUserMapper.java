package com.kobe.dao;

import com.kobe.entity.BaseUser;
import org.apache.ibatis.annotations.Param;

public interface BaseUserMapper {
    int deleteByPrimaryKey(String id);

    int insert(BaseUser record);

    int insertSelective(BaseUser record);

    BaseUser selectByPrimaryKey(String id);

    int updateByPrimaryKeySelective(BaseUser record);

    int updateByPrimaryKey(BaseUser record);

    BaseUser selectByUserNameAndPassword(@Param("userName")String userName,@Param("password")String password);
}