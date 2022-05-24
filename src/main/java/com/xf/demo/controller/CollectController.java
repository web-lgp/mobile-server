package com.xf.demo.controller;

import com.xf.demo.service.ICollectService;
import com.xf.demo.service.R;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

@RestController
@CrossOrigin
@ResponseBody
@RequestMapping("/collect/service")
//我的收藏
public class CollectController {
    @Autowired
    private ICollectService iCollectService;
    @GetMapping("insertCollect/{collect_userName}/{collect_id}")
    public R insertCollect(@PathVariable String collect_userName, @PathVariable int collect_id){
        iCollectService.insertCollect(collect_userName,collect_id);
        return R.ok().data("insertCollect","ok");
    }
    @GetMapping("deleteCollectById/{collect_userName}/{collect_id}")
    public R deleteCollectById(@PathVariable String collect_userName,int collect_id){
        iCollectService.deleteCollectById(collect_userName,collect_id);
        return R.ok().data("deleteCollectById","ok");
    }
    @GetMapping("selectCollectById/{collect_userName}/{collect_id}")
    public R selectCollectById(@PathVariable String collect_userName,@PathVariable int collect_id){
        Boolean bool=iCollectService.selectCollectById(collect_userName, collect_id);
        return R.ok().data("selectCollectById",bool);
    }
}
