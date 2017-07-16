package com.rock.balance.controller;

import com.rock.balance.service.BalanceService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

/**
 * 创建ConsumerController来消费COMPUTE-SERVICE的add服务
 * Created by caoqingyuan on 2017/7/12.
 */
@RestController
public class ConsumerController {

    @Autowired
    private BalanceService service;
    @RequestMapping(value = "/add", method = RequestMethod.GET)
    public String add() {
        return service.addService();
    }
}
