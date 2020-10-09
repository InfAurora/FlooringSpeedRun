package com.speedrun.flooringco.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;
import com.speedrun.flooringco.dao.OrderDao;

@Component
public class ServiceImpl {
    
    private OrderDao orderDao;

    @Autowired
    public ServiceImpl(OrderDao orderDao) {
        this.orderDao = orderDao;
    }
}
