package com.xf.demo.dao;

import com.xf.demo.bean.Commodity;
import org.apache.ibatis.annotations.Param;
import org.springframework.stereotype.Repository;

import java.util.List;
@Repository
public interface ICommodityDao {
    public List<Commodity> seletcAllCommodity();
    public Commodity selectByIdCommodity(int id);
    public  List<Commodity> selectBykey(Object key);
    public List<Commodity> selectShoppingCart(String user_name);
    public List<Commodity> selectTracks(String user_name);
    public List<Commodity> selectCollect(String collect_userName);
    public List<Commodity> selectShoppingCartLimit(@Param("limit")Integer limit);
    public List<Commodity> selectShoppingAscSort();
    public List<Commodity> selectShoppingDescSort();
    public List<Commodity> findall();
    List<Commodity> selectByKey(@Param("key")String key);
    int insertCommodity(@Param("img")String img,@Param("name")String name,
                        @Param("price")double price,@Param("productDescribe")String productDescribe);
    int updateComm(@Param("id")Integer id,@Param("img")String img,@Param("name")String name,
               @Param("price")double price,@Param("productDescribe")String productDescribe);
}
