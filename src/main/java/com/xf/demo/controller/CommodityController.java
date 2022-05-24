package com.xf.demo.controller;

import com.github.pagehelper.PageHelper;
import com.github.pagehelper.PageInfo;
import com.xf.demo.bean.Commodity;
import com.xf.demo.service.ICommodityService;
import com.xf.demo.service.R;
import org.apache.ibatis.annotations.Param;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@CrossOrigin
@ResponseBody
@RequestMapping("/commodity/service")
//商品
public class CommodityController {
    @Autowired
    private ICommodityService iCommodityService;
    @GetMapping("selectAllCommodity")
    @CrossOrigin
    public R selectAllCommodity(){
        List<Commodity> comm=iCommodityService.seletcAllCommodity();
        return R.ok().data("ListCommodity",comm);
    }
    @GetMapping("selectByIdCommodity/{id}")
    public R selectByIdCommodity(@PathVariable int id){
        Commodity commodity= iCommodityService.selectByIdCommodity(id);
        return R.ok().data("selByComm",commodity);
    }
    @GetMapping("selectBykey/{key}")
    public R selectBykey(@PathVariable Object key){
        List<Commodity> commodityList=iCommodityService.selectBykey(key);
        return R.ok().data("selBykey",commodityList);
    }
    @GetMapping("selectShoppingCart/{user_name}")
    public R selectShoppingCart(@PathVariable String user_name){
        List<Commodity> commList=iCommodityService.selectShoppingCart(user_name);
        return R.ok().data("selBykey",commList);
    }
    @GetMapping("selectTracks/{user_name}")
    public R selectTracks(@PathVariable String user_name){
        List<Commodity> commList=iCommodityService.selectTracks(user_name);
        return R.ok().data("selBykey",commList);
    }
    @GetMapping("selectCollect/{collect_userName}")
    public R selectCollect(@PathVariable String collect_userName){
        List<Commodity> commList=iCommodityService.selectCollect(collect_userName);
        return R.ok().data("selBykey",commList);
    }

    @GetMapping("selectShoppingCartLimit/{limit}")
    public R selectShoppingCartLimit(@PathVariable Integer limit){
        List<Commodity> commList=iCommodityService.selectShoppingCartLimit(limit);
        return R.ok().data("selectShoppingCartLimit",commList);
    }

    @GetMapping("selectShoppingAscSort")
    public R selectShoppingAscSort(){
        List<Commodity> commList=iCommodityService.selectShoppingAscSort();
        return R.ok().data("selectShoppingAscSort",commList);
    }

    @GetMapping("selectShoppingDescSort")
    public R selectShoppingDescSort(){
        List<Commodity> commList=iCommodityService.selectShoppingDescSort();
        return R.ok().data("selectShoppingDescSort",commList);
    }
    @GetMapping("findall/{pageNum}/{pageSize}")
    public R findall(@PathVariable("pageNum")Integer pageNum,@PathVariable("pageSize")Integer pageSize){
        //pageNum第几页    pageSize一页多少条
        PageHelper.startPage(pageNum,pageSize);
        List<Commodity> list=iCommodityService.findall();
        PageInfo<Commodity> pageInfo=new PageInfo<>(list);
        return R.ok().data("findall",pageInfo);
    }

    @GetMapping("selectByKey/{key}/{pageNum}/{pageSize}")
    public R selectByKey(@PathVariable("key")String key,
                         @PathVariable("pageNum")Integer pageNum,
                         @PathVariable("pageSize")Integer pageSize){
        PageHelper.startPage(pageNum,pageSize);
        List<Commodity> commodities = iCommodityService.selectByKey(key);
        PageInfo<Commodity> pageInfo=new PageInfo<>(commodities);
        return R.ok().data("key",pageInfo);
    }

    @GetMapping("insertCommodity/{img}/{name}/{price}/{productDescribe}")
    public R insertCommodity(@PathVariable("img")String img,
                         @PathVariable("name")String name,
                         @PathVariable("price")double price,
                         @PathVariable("productDescribe")String productDescribe){
        int i = iCommodityService.insertCommodity(img, name, price, productDescribe);
        return R.ok().data("key",i);
    }

    @GetMapping("updateComm/{id}/{img}/{name}/{price}/{productDescribe}")
    public R updateComm(@PathVariable("id")Integer id,@PathVariable("img")String img,
                             @PathVariable("name")String name,
                             @PathVariable("price")double price,
                             @PathVariable("productDescribe")String productDescribe){
        System.out.println(productDescribe);
        int i = iCommodityService.updateComm(id, img, name, price, productDescribe);
        return R.ok().data("key",i);
    }
}
