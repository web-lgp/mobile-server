package com.xf.demo.service.impl;

import com.xf.demo.dao.IAdminDao;
import com.xf.demo.service.IAdminService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class AdminService implements IAdminService {

    @Autowired
    private IAdminDao adminDao;

    @Override
    public int selectByNameandPwd(String name, String pwd) {
        int i=adminDao.selectByNameandPwd(name, pwd);
        return i;
    }
}
