package com.rock.service.controller;

import org.apache.log4j.Logger;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.cloud.client.ServiceInstance;
import org.springframework.cloud.client.discovery.DiscoveryClient;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

/**
 * 与另外的一个是相同的服务
 * Created by caoqingyuan on 2017/7/13.
 */
@RestController
public class AddController {
    private static final Logger logger=Logger.getLogger(AddController.class);

    //包含服务实例的相关内容
    @Autowired
    private DiscoveryClient client;

    @RequestMapping(value = "/add",method = RequestMethod.GET)
    public String add(@RequestParam Integer a, @RequestParam Integer b){
        logger.info("service");
        ServiceInstance instance = client.getLocalServiceInstance();
        int sum=a+b;
        logger.info("/add host:"+instance.getHost()+",service_id:"+instance.getServiceId()+",result:"+sum);
        return String.valueOf(sum);
    }
}
