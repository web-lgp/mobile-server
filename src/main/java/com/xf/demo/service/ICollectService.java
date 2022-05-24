package com.xf.demo.service;

public interface ICollectService {
    public void insertCollect(String collect_userName,int collect_id);
    public void deleteCollectById(String collect_userName,int collect_id);
    public Boolean selectCollectById(String collect_userName,int collect_id);

}
