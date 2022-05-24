package com.xf.demo.service.impl;

import com.xf.demo.bean.Count;
import com.xf.demo.dao.ICountDao;
import com.xf.demo.service.ICountService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
@Service
public class CountService implements ICountService {
    @Autowired
    private ICountDao iCountDao;
    @Override
    public List<Count> selectCountAll(String addShoppingCart_userName) {
        List<Count> count=iCountDao.selectCountAll(addShoppingCart_userName);
        return count;
    }

    @Override
    public int countUser() {
        return iCountDao.countUser();
    }

    @Override
    public int countComm() {
        return iCountDao.countComm();
    }

    @Override
    public int countAdmin() {
        return iCountDao.countAdmin();
    }

    @Override
    public int countIndent() {
        return iCountDao.countIndent();
    }

    @Override
    public int countSite(String province) {
        return iCountDao.countSite(province);
    }
}
