package com.xf.demo.controller;

import com.xf.demo.bean.Commodity;
import com.xf.demo.bean.Indent;
import com.xf.demo.service.IIdentService;
import com.xf.demo.service.R;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.Date;
import java.util.List;

@RestController
@CrossOrigin
@ResponseBody
@RequestMapping("/indent/service")
//订单
public class IndentController {
    @Autowired
    private IIdentService iIdentService;
    @GetMapping("insertIndent/{indentDate}/{userName}/{id}/{addShoppingCart_num}")
    public R insertIndent(@PathVariable String indentDate, @PathVariable String userName,
                          @PathVariable int id,@PathVariable int addShoppingCart_num){
        boolean indent=iIdentService.insertIndent(indentDate, userName, id,addShoppingCart_num);
        return R.ok().data("Indent",indent);
    }

    @GetMapping("selectIndents/{userName}/{state}")
    public R selectIndents(@PathVariable String userName,@PathVariable int state){
        List<Indent> indents=iIdentService.selectIndents(userName,state);
        return R.ok().data("selectIndents",indents);
    }

    @GetMapping("updateState/{userName}/{state}/{id}")
    public R updateState(@PathVariable String userName,@PathVariable int state,@PathVariable int id){
        Boolean indents=iIdentService.updateState(userName,state,id);
        return R.ok().data("updateState",indents);
    }
    @GetMapping("deleteIndent/{userName}/{commId}")
    public R deleteIndent(@PathVariable String userName,@PathVariable int commId){
        Boolean indents=iIdentService.deleteIndent(userName,commId);
        return R.ok().data("deleteIndent",indents);
    }
    @GetMapping("updateIndentDate/{commId}/{indentDate}")
    public R updateIndentDate(@PathVariable int commId,@PathVariable  String indentDate){
        Boolean indents=iIdentService.updateIndentDate(commId, indentDate);
        return R.ok().data("deleteIndent",indents);
    }

    @GetMapping("selectIndent/{commId}")
    public R selectIndent(@PathVariable int commId){
        Indent indent=iIdentService.selectIndent(commId);
        return R.ok().data("selectIndent",indent);
    }
    @GetMapping("IndentCount/{userName}/{obligation}")
    public R IndentCount(@PathVariable String userName,@PathVariable Integer obligation){
        Integer indent=iIdentService.IndentCount(userName,obligation);
        return R.ok().data("IndentCount",indent);
    }
}
