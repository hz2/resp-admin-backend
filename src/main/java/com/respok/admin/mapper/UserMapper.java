package com.respok.admin.mapper;

import com.respok.admin.dao.User;

import org.apache.ibatis.annotations.Param;

public interface UserMapper {

    User selectById(@Param("id") Integer id);

}
