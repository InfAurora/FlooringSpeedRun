package com.speedrun.flooringco.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;
import com.speedrun.flooringco.dao.FlooringPersistanceException;
import com.speedrun.flooringco.dao.OrderDao;
import com.speedrun.flooringco.dao.ProductDao;
import com.speedrun.flooringco.dao.TaxDao;
import com.speedrun.flooringco.dto.Product;

@Component
public class ServiceImpl {
    
    private OrderDao orderDao;
    private TaxDao taxDao;
    private ProductDao productDao;

    @Autowired
    public ServiceImpl(OrderDao orderDao, TaxDao taxDao, ProductDao productDao) {
        this.orderDao = orderDao;
        this.taxDao = taxDao;
        this.productDao = productDao;
    }

    public Product getTaxInfo(String productType) throws FlooringPersistanceException{
        
        Product product = productDao.getProductInfo(productType);
        return product;
    }
}
