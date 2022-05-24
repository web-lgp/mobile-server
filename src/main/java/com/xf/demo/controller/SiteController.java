package com.xf.demo.controller;

import com.xf.demo.bean.Site;
import com.xf.demo.service.ISiteService;
import com.xf.demo.service.R;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@CrossOrigin
@ResponseBody
@RequestMapping("/site/service")
//地址
public class SiteController {
    @Autowired
    private ISiteService iSiteService;
    @GetMapping("selectSiteAll/{userName}")
    public R selectSiteAll(@PathVariable String userName){
        List<Site> sites=iSiteService.selectSiteAll(userName);
        return R.ok().data("user",sites);
    }
    @GetMapping("insertSite/{userName}/{province}/{city}/{county}/{name}/{postalCode}/{tel}/{addressDetail}/{defaultDetail}")
    public R insertSite(@PathVariable String userName,@PathVariable String province,@PathVariable String city,@PathVariable String county,
                        @PathVariable String name,@PathVariable String postalCode,@PathVariable String tel,@PathVariable String addressDetail,
                        @PathVariable String defaultDetail){
        boolean falg=iSiteService.insertSite(userName,province,city,county,name,postalCode,tel,addressDetail,defaultDetail);
        return R.ok().data("boolean",falg);
    }
    @GetMapping("deleteSite/{userName}/{id}")
    public R deleteSite(@PathVariable String userName,@PathVariable int id){
        boolean falg=iSiteService.deleteSite(userName,id);
        return R.ok().data("boolean",falg);
    }
    @GetMapping("updataSiteisDefault/{id}")
    public R updataSiteisDefault(@PathVariable int id){
        boolean falg=iSiteService.updataSiteisDefault(id);
        return R.ok().data("boolean",falg);
    }
    @GetMapping("updataSite/{province}/{city}/{county}/{name}/{postalCode}/{tel}/{addressDetail}/{defaultDetail}/{id}")
    public R updataSite(@PathVariable String province,@PathVariable String city,@PathVariable String county,
                        @PathVariable String name,@PathVariable String postalCode,@PathVariable String tel,@PathVariable String addressDetail,
                        @PathVariable String defaultDetail,@PathVariable int id){
        Site site=new Site(province,city,county,name,postalCode,tel,addressDetail,defaultDetail,id);
        boolean falg=iSiteService.updataSite(site);
        return R.ok().data("boolean",falg);
    }
    @GetMapping("updateAddisDefault/{userName}")
    public R updateAddisDefault(@PathVariable String userName){
        boolean falg=iSiteService.updateAddisDefault(userName);
        return R.ok().data("bool",falg);
    }
    @GetMapping("selectDefaultSite/{userName}")
    public R selectDefaultSite(@PathVariable String userName){
        Site site=iSiteService.selectDefaultSite(userName);
        return R.ok().data("Site",site);
    }
}
