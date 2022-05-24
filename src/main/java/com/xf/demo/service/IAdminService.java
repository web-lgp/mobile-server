package com.xf.demo.service;

import org.apache.ibatis.annotations.Param;

public interface IAdminService {
    int selectByNameandPwd(@Param("name")String name, @Param("pwd")String pwd);
}
