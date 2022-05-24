package com.xf.demo.dao;

import com.xf.demo.bean.Count;
import org.apache.ibatis.annotations.Param;
import org.springframework.stereotype.Repository;

import java.util.List;
@Repository
public interface ICountDao {
    public List<Count> selectCountAll(@Param("addShoppingCart_userName")String addShoppingCart_userName);
    int countUser();
    int countComm();
    int countAdmin();
    int countIndent();
    int countSite(@Param("province")String province);
}
