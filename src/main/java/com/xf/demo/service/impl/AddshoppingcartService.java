package com.xf.demo.service.impl;

import com.xf.demo.bean.AddShoppingCart;
import com.xf.demo.dao.IAddShoppingCartDao;
import com.xf.demo.service.IAddShoppingCartService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

/**
 *
 */
@Service
public class AddshoppingcartService implements IAddShoppingCartService {
    @Autowired
    private IAddShoppingCartDao iAddShoppingCartDao;

    @Override
    public void insertAddShoppingCart(String addShoppingCart_userName, int addShoppingCart_id) {
        AddShoppingCart addShoppingCart=new AddShoppingCart();
        addShoppingCart.setAddShoppingCart_userName(addShoppingCart_userName);
        addShoppingCart.setId(addShoppingCart_id);
        iAddShoppingCartDao.insertAddShoppingCart(addShoppingCart);
    }

    @Override
    public void updateAddShoppingCart(String addShoppingCart_userName, int id, int num) {
        iAddShoppingCartDao.updateAddShoppingCart(addShoppingCart_userName, id, num);
    }

    @Override
    public List<AddShoppingCart> selectByIdAndUserName(String addShoppingCart_userName, int addShoppingCart_id) {
        List<AddShoppingCart> addShoppingCartsList=iAddShoppingCartDao.selectByIdAndUserName(addShoppingCart_userName,addShoppingCart_id);
        return addShoppingCartsList;
    }

    @Override
    public List<AddShoppingCart> selectByUserName(String addShoppingCart_userName) {
        List<AddShoppingCart> addShoppingCartsList=iAddShoppingCartDao.selectByUserName(addShoppingCart_userName);
        return addShoppingCartsList;
    }

    @Override
    public double selectPrice(String userName,int id) {
        double price=iAddShoppingCartDao.selectPrice(userName,id);
        return price;
    }

    @Override
    public Boolean deleteCart(String addShoppingCart_userName, int id) {
        Boolean aBoolean = iAddShoppingCartDao.deleteCart(addShoppingCart_userName, id);
        return aBoolean;
    }
}




