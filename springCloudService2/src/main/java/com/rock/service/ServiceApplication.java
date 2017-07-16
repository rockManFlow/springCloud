package com.rock.service;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.client.discovery.EnableDiscoveryClient;

/**
 * 创建提供服务的客户端
 * Created by caoqingyuan on 2017/7/11.
 */
@EnableDiscoveryClient
//会扫描根目录下的所有注解
@SpringBootApplication
public class ServiceApplication {
    public static void main(String[] args){
        SpringApplication.run(ServiceApplication.class,args);
    }
}
