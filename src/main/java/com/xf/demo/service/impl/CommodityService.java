package com.xf.demo.service.impl;

import com.github.pagehelper.PageHelper;
import com.xf.demo.bean.Commodity;
import com.xf.demo.dao.ICommodityDao;
import com.xf.demo.service.ICommodityService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
@Service
public class CommodityService implements ICommodityService {

    @Autowired
    private ICommodityDao iCommodityDao;
    @Override
    public List<Commodity> seletcAllCommodity() {
        List<Commodity> commList=iCommodityDao.seletcAllCommodity();
        return commList;
    }

    @Override
    public Commodity selectByIdCommodity(int id) {
        Commodity commodity=iCommodityDao.selectByIdCommodity(id);
        return commodity;
    }

    @Override
    public List<Commodity> selectBykey(Object key) {
        List<Commodity> commodityList=iCommodityDao.selectBykey(key);
        return commodityList;
    }

    @Override
    public List<Commodity> selectShoppingCart(String user_name) {
        List<Commodity> commlist=iCommodityDao.selectShoppingCart(user_name);
        return commlist;
    }

    @Override
    public List<Commodity> selectTracks(String user_name) {
        List<Commodity> commlist=iCommodityDao.selectTracks(user_name);
        return commlist;
    }

    @Override
    public List<Commodity> selectCollect(String collect_userName) {
        List<Commodity> commlist=iCommodityDao.selectCollect(collect_userName);
        return commlist;
    }

    @Override
    public List<Commodity> selectShoppingCartLimit(Integer limit) {
        List<Commodity> commList=iCommodityDao.selectShoppingCartLimit(limit);
        return commList;
    }

    @Override
    public List<Commodity> selectShoppingAscSort() {
        List<Commodity> commList=iCommodityDao.selectShoppingAscSort();
        return commList;
    }

    @Override
    public List<Commodity> selectShoppingDescSort() {
        List<Commodity> commList=iCommodityDao.selectShoppingDescSort();
        return commList;
    }

    @Override
    public List<Commodity> findall() {
        List<Commodity> list =iCommodityDao.findall();
        return list;
    }

    @Override
    public List<Commodity> selectByKey(String key) {
        List<Commodity> commodities = iCommodityDao.selectByKey(key);
        return commodities;
    }

    @Override
    public int insertCommodity(String img, String name, double price, String productDescribe) {
        int i = iCommodityDao.insertCommodity(img, name, price, productDescribe);
        return i;
    }

    @Override
    public int updateComm(Integer id, String img, String name, double price, String productDescribe) {
        int i = iCommodityDao.updateComm(id, img, name, price, productDescribe);
        return i;
    }
}
