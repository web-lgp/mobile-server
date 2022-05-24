package com.xf.demo.controller;

import com.xf.demo.bean.Count;
import com.xf.demo.service.ICountService;
import com.xf.demo.service.R;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.ArrayList;
import java.util.List;

@RestController
@CrossOrigin
@ResponseBody
@RequestMapping("/count/service")
public class CountController {
    @Autowired
    private ICountService iCountService;
    @GetMapping("selectCountAll/{addShoppingCart_userName}")
    public R selectCountAll(@PathVariable String addShoppingCart_userName){
        List<Count> CountAll=iCountService.selectCountAll(addShoppingCart_userName);
        System.out.println(CountAll);
        return R.ok().data("CountAll",CountAll);
    }

    @GetMapping("count")
    public List<Integer> count(){
        List<Integer> list=new ArrayList<>();
        list.add(iCountService.countUser());
        list.add(iCountService.countComm());
        list.add(iCountService.countIndent());
        list.add(iCountService.countAdmin());
        return list;
    }

    @GetMapping("countSit/{province}")
    public int SiteCount(@PathVariable String province){
        return iCountService.countSite(province);
    }
}
