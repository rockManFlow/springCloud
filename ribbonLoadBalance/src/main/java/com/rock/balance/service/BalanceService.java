package com.rock.balance.service;

import com.netflix.hystrix.contrib.javanica.annotation.HystrixCommand;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.web.client.RestTemplate;

/**
 * Created by caoqingyuan on 2017/7/16.
 */
@Service
public class BalanceService {
    @Autowired
    private RestTemplate restTemplate;
    //提供断路由的功能，当指定服务访问不到，切断访问请求，回退到指定的方法中
    @HystrixCommand(fallbackMethod = "fallbackMethod")
    public String addService(){
        return restTemplate.getForEntity("http://pay-service/add?a=10&b=20", String.class).getBody();
    }
    public String fallbackMethod(){
        return "error";
    }
}
