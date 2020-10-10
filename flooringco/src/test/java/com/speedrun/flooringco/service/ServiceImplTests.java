package com.speedrun.flooringco.service;

import static org.junit.jupiter.api.Assertions.*;

import com.speedrun.flooringco.dao.OrderDao;
import com.speedrun.flooringco.dao.ProductDao;
import com.speedrun.flooringco.dao.TaxDao;

import org.junit.jupiter.api.AfterAll;
import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

public class ServiceImplTests {

    private OrderDao orderDao;
    private TaxDao taxDao;
    private ProductDao productDao;

    ServiceImpl service = new ServiceImpl(orderDao, taxDao, productDao);

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
	void contextLoads() {

		assertTrue(5 == 5);
	}
}
