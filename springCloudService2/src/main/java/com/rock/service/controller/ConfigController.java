package com.rock.service.controller;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;

/**
 * 获取配置文件服务器指定文件中属性值
 * Created by caoqingyuan on 2017/7/16.
 */
@RestController
public class ConfigController {
    //绑定配置服务器中指定配置文件中属性名testData。如果获取不到就使用hhhh这个参数值
    @Value("${testData:hhhh}")
    private String testData;

    @RequestMapping("/te")
    @ResponseBody
    public String from() {
        return "config:"+this.testData;
    }
}
