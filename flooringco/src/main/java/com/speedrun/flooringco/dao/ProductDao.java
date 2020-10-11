package com.speedrun.flooringco.dao;

import com.speedrun.flooringco.dto.Product;

public interface ProductDao {
    public Product getProductInfo(String productType) throws FlooringPersistanceException;
}
