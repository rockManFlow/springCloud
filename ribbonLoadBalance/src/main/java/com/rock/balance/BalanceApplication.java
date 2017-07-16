package com.rock.balance;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.client.circuitbreaker.EnableCircuitBreaker;
import org.springframework.cloud.client.discovery.EnableDiscoveryClient;
import org.springframework.cloud.client.loadbalancer.LoadBalanced;
import org.springframework.context.annotation.Bean;
import org.springframework.web.client.RestTemplate;

/**
 * 创建提供服务的客户端
 * Created by caoqingyuan on 2017/7/11.
 */
//会扫描根目录下的所有注解
@SpringBootApplication
//添加发现服务的能力
@EnableDiscoveryClient
//开启断路由的功能
@EnableCircuitBreaker
public class BalanceApplication {
    @Bean
    @LoadBalanced
    //使用RestTemplate开启客户端负载均衡能力
    RestTemplate restTemplate() {
        return new RestTemplate();
    }

    public static void main(String[] args){
        SpringApplication.run(BalanceApplication.class,args);
    }
}
