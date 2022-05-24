package com.xf.demo.dao;
import com.xf.demo.bean.User;
import org.apache.ibatis.annotations.Param;
import org.springframework.stereotype.Repository;

@Repository
public interface IUserDao {
    public User login(User user);
    public void updateUser(@Param("user_name") String user_name,@Param("user_pwd") String user_pwd,@Param("password") String password);
    public void insertUser(User user);
    public User findUserByName(String user_name);
    public Boolean updateMoney(@Param("user_name")String user_name,@Param("money")int money);
    public Boolean updateTotalAssets(@Param("user_name") String user_name);
    public Boolean updateUserMessage(@Param("user_name")String user_Name,@Param("user_buynum")int user_buynum,
                                    @Param("consume")double consume);
}
