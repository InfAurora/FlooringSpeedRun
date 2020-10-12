package com.speedrun.flooringco.dao;

import static org.junit.jupiter.api.Assertions.*;

import java.math.BigDecimal;

import com.speedrun.flooringco.dto.Product;

import org.junit.jupiter.api.AfterAll;
import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

public class ProductDaoImplTests {
    
    ProductDaoImpl dao = new ProductDaoImpl();

    @BeforeAll
    static void initAll() {
    }

    @BeforeEach
    void init() {
    }
	
	@AfterEach
    void tearDown() {
    }

    @AfterAll
    static void tearDownAll() {
	}
	
	@Test
	void getProductInfo() throws Exception{
        String productType = "Carpet";
        Product productObject = dao.getProductInfo(productType);

        assertEquals(productObject.getProductType(), productType);
        assertEquals(productObject.getCostPerSquareFoot(), new BigDecimal("2.25"));
        assertEquals(productObject.getLaborCostPerSquareFoot(), new BigDecimal("2.10"));
	}
}
