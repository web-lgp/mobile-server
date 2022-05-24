package com.xf.demo.dao;

import org.apache.ibatis.annotations.Param;
import org.springframework.stereotype.Repository;

@Repository
public interface IAdminDao {
    int selectByNameandPwd(@Param("name")String name,@Param("pwd")String pwd);
}
