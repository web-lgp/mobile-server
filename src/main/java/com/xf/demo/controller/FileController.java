package com.xf.demo.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.*;
import org.springframework.web.multipart.MultipartFile;
import org.springframework.web.servlet.config.annotation.WebMvcConfigurer;

import java.io.File;
import java.util.Map;
import java.util.UUID;

@RestController
@CrossOrigin
@ResponseBody
@RequestMapping("/api/file")
@Controller
public class FileController implements WebMvcConfigurer {
    @PostMapping(value = "/upload",produces = "multipart/form-data;charset=utf-8")
    @ResponseBody
    public String upFile(@RequestParam("file") MultipartFile file, Map map) {
        String path = "D:\\demo\\src\\main\\resources\\img\\";
        System.out.println(file.toString());
        String fileName = file.getOriginalFilename();//获取文件名称
        String suffixName=fileName.substring(fileName.lastIndexOf("."));//获取文件后缀
        fileName= UUID.randomUUID()+suffixName;//重新生成文件名
        File targetFile = new File(path);
        if (!targetFile.exists()) {
            // 判断文件夹是否未空，空则创建
            targetFile.mkdirs();
        }
        File saveFile = new File(targetFile, fileName);
        String path1="";
        try {
            //指定本地存入路径
            file.transferTo(saveFile);
            path1 = path + fileName;
            System.out.println(path1);
            //     return "success";
        } catch (Exception e) {
            e.printStackTrace();
            return "failed";
        }
        map.put("img",fileName);//Java 集合类中的 Map.put() 方法将获取 Map 集合的所有键名，并存放在一个 Set 集合对象中。
        return fileName;
    }
}
