package com.xf.demo.service.impl;

import com.xf.demo.bean.User;
import com.xf.demo.dao.IUserDao;
import com.xf.demo.service.IUserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
@Service
public class UserService implements IUserService {

    @Autowired
    private IUserDao iUserDao;
    @Override
    public User login(User user) {
        User user1=iUserDao.login(user);
        return user1;
    }
    @Override
    public User findUserByName(String user_name) {
        User user=iUserDao.findUserByName(user_name);
        return user;
    }

    @Override
    public void insertUser(String name, String pwd, String tel, int age, String sex) {
        User user=new User();
        user.setUser_name(name);
        user.setUser_pwd(pwd);
        user.setTel(tel);
        user.setUser_age(age);
        user.setUser_sex(sex);
        iUserDao.insertUser(user);
    }

    @Override
    public void updateUser(String user_name,String user_pwd,String password) {
        iUserDao.updateUser(user_name,user_pwd,password);
    }

    @Override
    public Boolean updateMoney(String user_name,int money) {
        return iUserDao.updateMoney(user_name,money);
    }

    @Override
    public Boolean updateTotalAssets(String user_name) {
        return iUserDao.updateTotalAssets(user_name);
    }

    @Override
    public Boolean updateUserMessage(String user_Name, int user_buynum, double consume) {
        return iUserDao.updateUserMessage(user_Name, user_buynum, consume);
    }

}
