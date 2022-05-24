package com.xf.demo.service;

import com.xf.demo.bean.Site;
import org.apache.ibatis.annotations.Param;

import java.util.List;

public interface ISiteService {
    public List<Site> selectSiteAll(String userName);
    public boolean insertSite(String userName,String province,String city,String county,String name, String postalCode,
                              String tel,String addressDetail,
                              String defaultDetail);
    public boolean deleteSite(String userName,int id);
    public boolean updataSiteisDefault(int id);
    public boolean updataSite(Site site);
    public boolean updateAddisDefault(String userName);
    public Site selectDefaultSite(String userName);
}
