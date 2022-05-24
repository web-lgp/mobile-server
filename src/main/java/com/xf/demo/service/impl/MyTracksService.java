package com.xf.demo.service.impl;

import com.xf.demo.bean.MyTracks;
import com.xf.demo.dao.IMyTracksDao;
import com.xf.demo.service.IMyTracksService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class MyTracksService implements IMyTracksService {

    @Autowired
    private IMyTracksDao iMyTracksDao;
    @Override
    public void insertMyTracks(String myTracks_user_Name, int myTracks_id) {
        MyTracks myTracks=new MyTracks();
        myTracks.setMyTracks_userName(myTracks_user_Name);
        myTracks.setMyTracks_id(myTracks_id);
        iMyTracksDao.insertMyTracks(myTracks);
    }

    @Override
    public void deleteMyTracksById(String myTracks_userName,int myTracks_id) {
        iMyTracksDao.deleteMyTracksById(myTracks_userName,myTracks_id);
    }
}
