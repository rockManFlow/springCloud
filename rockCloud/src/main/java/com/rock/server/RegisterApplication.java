package com.rock.server;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.netflix.eureka.server.EnableEurekaServer;

/**
 * 创建服务注册中心--服务端
 * Created by caoqingyuan on 2017/7/11.
 */
@EnableEurekaServer
//会扫描根目录下的所有注解
@SpringBootApplication
public class RegisterApplication {
    public static void main(String[] args){
        SpringApplication.run(RegisterApplication.class,args);
    }
}
