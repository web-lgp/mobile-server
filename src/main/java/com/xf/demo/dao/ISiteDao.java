package com.xf.demo.dao;

import com.xf.demo.bean.Site;
import org.apache.ibatis.annotations.Param;
import org.springframework.stereotype.Repository;

import java.util.List;
@Repository
public interface ISiteDao {
    public List<Site> selectSiteAll(String userName);
    public boolean insertSite(Site site);
    public boolean deleteSite(@Param("userName")String userName,@Param("id") int id);
    public boolean updataSiteisDefault(int id);
    public boolean updataSite(Site site);
    public boolean updateAddisDefault(@Param("userName")String userName);
    public Site selectDefaultSite(@Param("userName")String userName);
}
