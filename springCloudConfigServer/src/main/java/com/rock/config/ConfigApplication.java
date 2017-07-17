package com.rock.config;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.config.server.EnableConfigServer;

/**
 * 创建提供服务的客户端
 * Created by caoqingyuan on 2017/7/11.
 */
//会扫描根目录下的所有注解
@SpringBootApplication
//开启配置服务
@EnableConfigServer
public class ConfigApplication {
    public static void main(String[] args){
        SpringApplication.run(ConfigApplication.class,args);
    }
}
