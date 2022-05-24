package com.xf.demo.dao;

import com.xf.demo.bean.Collect;
import org.apache.ibatis.annotations.Param;
import org.springframework.stereotype.Repository;

@Repository
public interface ICollectDao {
    public void insertCollect(Collect collect);
    public void deleteCollectById(@Param("collect_userName")String collect_userName,@Param("collect_id")int collect_id);
    public Boolean selectCollectById(@Param("collect_userName")String collect_userName,@Param("collect_id")int collect_id);
}
