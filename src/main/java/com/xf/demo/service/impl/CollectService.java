package com.xf.demo.service.impl;

import com.xf.demo.bean.Collect;
import com.xf.demo.dao.ICollectDao;
import com.xf.demo.service.ICollectService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class CollectService implements ICollectService {
    @Autowired
    private ICollectDao iCollectDao;
    @Override
    public void insertCollect(String collect_userName, int collect_id) {
        Collect collect=new Collect();
        collect.setCollect_userName(collect_userName);
        collect.setCollect_id(collect_id);
        iCollectDao.insertCollect(collect);
    }

    @Override
    public void deleteCollectById(String collect_userName, int collect_id) {
        iCollectDao.deleteCollectById(collect_userName,collect_id);
    }

    @Override
    public Boolean selectCollectById(String collect_userName, int collect_id) {
        boolean indents=iCollectDao.selectCollectById(collect_userName,collect_id)==null?false:true;
        return indents;
    }
}
