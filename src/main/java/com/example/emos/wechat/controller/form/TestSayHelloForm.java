package com.example.emos.wechat.controller.form;


import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import lombok.Data;

import javax.validation.constraints.NotBlank;
import javax.validation.constraints.Pattern;


@ApiModel
@Data
public class TestSayHelloForm {
 //   @NotBlank
 //   @Pattern(regexp = "^[\\u4100-\\u9fa5]{2,15}$")//简体汉字的正则表达式
    @ApiModelProperty("姓名")
    private String name;






}
