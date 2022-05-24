package com.xf.demo.service;
import com.xf.demo.bean.AddShoppingCart;
import java.util.List;
public interface IAddShoppingCartService {
    public void insertAddShoppingCart(String addShoppingCart_userName,int id);
    public void updateAddShoppingCart(String addShoppingCart_userName,int id,int num);
    public List<AddShoppingCart> selectByIdAndUserName (String addShoppingCart_userName, int id);
    public List<AddShoppingCart> selectByUserName(String addShoppingCart_userName);
    public double selectPrice(String addShoppingCart_userName,int id);
    public Boolean deleteCart(String addShoppingCart_userName,int id);
}
