package com.xf.demo.controller;

import com.xf.demo.bean.Admin;
import com.xf.demo.bean.post.Login;
import com.xf.demo.service.IAdminService;
import com.xf.demo.service.R;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.*;

@RestController
@CrossOrigin
@ResponseBody
@Controller
@RequestMapping("/admin/service")
public class AdminController {
    @Autowired
    private IAdminService adminService;

    @PostMapping(value="/login")
    public R login(@RequestBody Login login){
        int i=adminService.selectByNameandPwd(login.getName(),login.getPwd());
        return R.ok().data("login",i);
    }

}
