package com.xf.demo.controller;

import com.xf.demo.bean.User;
import com.xf.demo.service.IUserService;
import com.xf.demo.service.R;
import org.apache.ibatis.annotations.Param;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

@RestController
@CrossOrigin
@ResponseBody
@RequestMapping("/user/service")
public class UserController {
    @Autowired
    private IUserService iUserService;

    @GetMapping("getUserByName/{user_name}")
    public R getUserByName(@PathVariable String user_name){
       User user=iUserService.findUserByName(user_name);
       return R.ok().data("user",user);
    }

    @GetMapping("login/{admin}/{pwd}")
    public R login(@PathVariable String admin,@PathVariable String pwd){
        User user2=new User();
        user2.setUser_name(admin);
        user2.setUser_pwd(pwd);
        User user1=iUserService.login(user2);
        return R.ok().data("user",user1);
    }

    @GetMapping("insertUser/{name}/{pwd}/{tel}/{age}/{sex}")
    public R insertUser(@PathVariable String name,@PathVariable String pwd,@PathVariable String tel,@PathVariable int age,@PathVariable String sex){
        iUserService.insertUser(name,pwd,tel,age,sex);
        return R.ok().data("insertUser","ok");
    }

    @GetMapping("updateUser/{user_name}/{user_pwd}/{password}")
    public R updateUser(@PathVariable String user_name,@PathVariable String user_pwd,String password){
        iUserService.updateUser(user_name,user_pwd,password);
        return R.ok().data("updateUser","ok");
    }

    @GetMapping("updateMoney/{user_name}/{money}")
    public R updateUser(@PathVariable String user_name,@PathVariable int money){
         Boolean falg=iUserService.updateMoney(user_name,money);
        return R.ok().data("updateMoney",falg);
    }

    @GetMapping("updateTotalAssets/{user_name}")
    public R updateTotalAssets(@PathVariable String user_name){
        Boolean falg=iUserService.updateTotalAssets(user_name);
        return R.ok().data("updateTotalAssets",falg);
    }

    @GetMapping("updateUserMessage/{user_name}/{user_buynum}/{consume}")
    public R updateUserMessage(@PathVariable String user_name,@PathVariable int user_buynum,
                               @PathVariable("consume")double consume){
        return R.ok().data("updateTotalAssets",iUserService.updateUserMessage(user_name, user_buynum, consume));
    }
}
