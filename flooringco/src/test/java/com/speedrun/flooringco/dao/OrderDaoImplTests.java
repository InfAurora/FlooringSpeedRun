package com.speedrun.flooringco.dao;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.AfterAll;
import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

public class OrderDaoImplTests {

    OrderDaoImpl dao = new OrderDaoImpl();

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
