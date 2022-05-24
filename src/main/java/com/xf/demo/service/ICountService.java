package com.xf.demo.service;

import com.xf.demo.bean.Count;
import org.apache.ibatis.annotations.Param;

import java.util.List;

public interface ICountService {
    public List<Count> selectCountAll(String addShoppingCart_userName);
    int countUser();
    int countComm();
    int countAdmin();
    int countIndent();
    int countSite(@Param("province")String province);
}
