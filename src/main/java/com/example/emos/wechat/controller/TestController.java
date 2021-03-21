package com.example.emos.wechat.controller;


import com.example.emos.wechat.common.util.R;
import com.example.emos.wechat.controller.form.TestSayHelloForm;
import io.swagger.annotations.Api;
import io.swagger.annotations.ApiOperation;
import org.springframework.web.bind.annotation.*;

import javax.validation.Valid;

@RestController
@RequestMapping("/test")
@Api("测试接口")
public class TestController{
    @PostMapping("/SayHello")
    @ApiOperation("测试方法")

    public R sayHello(@Valid @RequestBody TestSayHelloForm form){
        return R.ok().put("message","Hello,"+form.getName());
    }

}

