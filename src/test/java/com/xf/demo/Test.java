package com.xf.demo;

import com.xf.demo.bean.Commodity;
import com.xf.demo.bean.User;
import com.xf.demo.dao.ICommodityDao;
import com.xf.demo.dao.IUserDao;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringRunner;

import java.util.List;

@RunWith(SpringRunner.class)
@SpringBootTest(classes = DemoApplication.class)
public class Test {
//    @Autowired
//    private IUserDao iUserDao=null;
//    private ICommodityDao iCommodityDao=null;
//    @org.junit.Test
//    public void delUser(){
//        iUserDao.delUser("信金鑫1");
//    }
//
//    @org.junit.Test
//    public void updateUser(){
//        iUserDao.updateUser1(2);
//    }
//
//    @org.junit.Test
//    public void insertUser(){
//        User user=new User();
//        user.setId(1);
//        user.setUser_name("信金鑫1");
//        user.setRole_id(2009);
//        iUserDao.insertUser(user);
//    }
//
//    @org.junit.Test
//    public void selectAllCommodity(){
//        List<Commodity> comm= iCommodityDao.selectBykey("手机");
//        System.out.print(comm.toString());
//    }
}
