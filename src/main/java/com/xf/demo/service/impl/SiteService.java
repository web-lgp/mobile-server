package com.xf.demo.service.impl;

import com.xf.demo.bean.Site;
import com.xf.demo.dao.ISiteDao;
import com.xf.demo.service.ISiteService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class SiteService implements ISiteService {
    @Autowired
    private ISiteDao iSiteDao;
    @Override
    public List<Site> selectSiteAll(String userName) {
        return iSiteDao.selectSiteAll(userName);
    }

    @Override
    public boolean insertSite(String userName, String province, String city, String county, String name, String postalCode, String tel, String addressDetail, String defaultDetail) {
        Site site=new Site(userName,province,city,county,name,postalCode,tel,addressDetail,defaultDetail);
        return iSiteDao.insertSite(site);
    }

    @Override
    public boolean deleteSite(String userName, int id) {
        return iSiteDao.deleteSite(userName,id);
    }

    @Override
    public boolean updataSiteisDefault(int id) {
        return iSiteDao.updataSiteisDefault(id);
    }

    @Override
    public boolean updataSite(Site site) {
        return iSiteDao.updataSite(site);
    }

    @Override
    public boolean updateAddisDefault(String userName) {
        return iSiteDao.updateAddisDefault(userName);
    }

    @Override
    public Site selectDefaultSite(String userName) {
        Site site=iSiteDao.selectDefaultSite(userName);
        return site;
    }


}
