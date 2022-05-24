package com.xf.demo.controller;

import com.xf.demo.service.IMyTracksService;
import com.xf.demo.service.R;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

@RestController
@CrossOrigin
@ResponseBody
@RequestMapping("/myTracks/service")
//我的足迹
public class MyTracksController {
    @Autowired
    private IMyTracksService iMyTracksService;
    @GetMapping("insertMyTracks/{myTracks_userName}/{myTracks_id}")
    public R insertMyTracks(@PathVariable String myTracks_userName, @PathVariable int myTracks_id){
        iMyTracksService.insertMyTracks(myTracks_userName,myTracks_id);
        return R.ok().data("insertMyTracks","ok");
    }
    @GetMapping("deleteMyTracksById/{myTracks_userName}/{myTracks_id}")
    public R deleteMyTracksById(@PathVariable String myTracks_userName,int myTracks_id){
        iMyTracksService.deleteMyTracksById(myTracks_userName,myTracks_id);
        return R.ok().data("insertMyTracks","ok");
    }
}
