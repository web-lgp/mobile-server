package com.xf.demo.service;
import com.xf.demo.bean.User;
import org.apache.ibatis.annotations.Param;

public interface IUserService {
    public User login(User user);
    public User findUserByName(String user_name);
    public void insertUser(String name, String pwd, String tel, int age, String sex);
    public void updateUser(String user_name,String user_pwd,String password);
    public Boolean updateMoney(String user_name,int money);
    public Boolean updateTotalAssets(String user_name);
    public Boolean updateUserMessage(String user_Name,int user_buynum,double consume);
}
