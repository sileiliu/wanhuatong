package com.example.demo.controller;

import cn.hutool.http.HttpUtil;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

//@Controller 控制层需要的注解
//@RestController 使用这个也是可以的，但是使用后他里面所有请求返回的都是字符串！
//一般只需要作为接口放回JSON格式数据的话推荐使用@RestController
//@Controller这个是可以与Thymeleaf模板引擎使用时可以返回一个页面的
@Controller
//@RequestMapping指定路径名
//@RequestMapping("/test")用这个来指定路径也是可以的
@RequestMapping(value = "/test")
public class UserInfoController {

    //Get请求
    @GetMapping
    //@ResponseBody 注释后表示放回的是字符串
    @ResponseBody
    public String queryAll(){
//        HttpUtil.get
        return "test spring boot";
    }
}
