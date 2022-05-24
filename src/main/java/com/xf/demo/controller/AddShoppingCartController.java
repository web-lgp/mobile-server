package com.xf.demo.controller;
import com.xf.demo.bean.AddShoppingCart;
import com.xf.demo.service.IAddShoppingCartService;
import com.xf.demo.service.R;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;
import java.util.List;

@RestController
@CrossOrigin
@ResponseBody
@RequestMapping("/addShoppingCart/service")
//购物车
public class AddShoppingCartController {
    @Autowired
    private IAddShoppingCartService iAddShoppingCartService;
    @GetMapping("insertAddShoppingCart/{addShoppingCart_userName}/{id}")
    public R insertAddShoppingCart(@PathVariable String addShoppingCart_userName,@PathVariable int id){
        iAddShoppingCartService.insertAddShoppingCart(addShoppingCart_userName,id);
        return R.ok().data("insertAddShoppingCart","ok");
    }
    @GetMapping("updateAddShoppingCart/{addShoppingCart_userName}/{id}/{num}")
    public R updateAddShoppingCart(@PathVariable String addShoppingCart_userName,@PathVariable int id,@PathVariable int num){
        iAddShoppingCartService.updateAddShoppingCart(addShoppingCart_userName,id,num);
        return R.ok().data("updateAddShoppingCart","ok");
    }

    @GetMapping("selectByIdAndUserName/{addShoppingCart_userName}/{id}")
    public R selectByIdAndUserName(@PathVariable String addShoppingCart_userName,@PathVariable int id){
        List<AddShoppingCart> addShoppingCartsList=iAddShoppingCartService.selectByIdAndUserName(addShoppingCart_userName,id);
        return R.ok().data("selectByIdAndUserName",addShoppingCartsList);
    }
    @GetMapping("selectByUserName/{addShoppingCart_userName}")
    public R selectByUserName(@PathVariable String addShoppingCart_userName){
        List<AddShoppingCart> addShoppingCartsList=iAddShoppingCartService.selectByUserName(addShoppingCart_userName);
        return R.ok().data("selectByUserName",addShoppingCartsList);
    }

    @GetMapping("selectPrice/{addShoppingCart_userName}/{id}")
    public R selectPrice(@PathVariable String addShoppingCart_userName,@PathVariable int id){
        double price=iAddShoppingCartService.selectPrice(addShoppingCart_userName,id);
        return R.ok().data("selectPrice",price);
    }
    @GetMapping("deleteCart/{addShoppingCart_userName}/{id}")
    public R deleteCart(@PathVariable String addShoppingCart_userName,@PathVariable int id){
       boolean falg=iAddShoppingCartService.deleteCart(addShoppingCart_userName,id);
        return R.ok().data("deleteCart",falg);
    }
}
