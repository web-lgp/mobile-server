package com.xf.demo.dao;

import com.xf.demo.bean.MyTracks;
import org.apache.ibatis.annotations.Param;
import org.springframework.stereotype.Repository;

@Repository
public interface IMyTracksDao {
    public void insertMyTracks(MyTracks myTracks);//我的足迹模块同字段
    public void deleteMyTracksById(@Param("myTracks_userName")String myTracks_userName,@Param("myTracks_id") int myTracks_id);
}
