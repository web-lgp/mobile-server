package com.xf.demo.dao;

import com.xf.demo.bean.AddShoppingCart;
import org.apache.ibatis.annotations.Param;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface IAddShoppingCartDao {
    public void insertAddShoppingCart(AddShoppingCart addShoppingCart);
    public void updateAddShoppingCart(@Param("addShoppingCart_userName")String addShoppingCart_userName,@Param("id")int id,@Param("num")int num);
    public List<AddShoppingCart> selectByIdAndUserName(@Param("addShoppingCart_userName")String addShoppingCart_userName,@Param("id")int  id);
    public List<AddShoppingCart> selectByUserName(@Param("addShoppingCart_userName")String addShoppingCart_userName);
    public double selectPrice(@Param("addShoppingCart_userName")String addShoppingCart_userName,@Param("id")int id);
    public Boolean deleteCart(@Param("addShoppingCart_userName")String addShoppingCart_userName,@Param("id")int  id);
}
