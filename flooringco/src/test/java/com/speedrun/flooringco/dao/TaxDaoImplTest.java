package com.speedrun.flooringco.dao;

import static org.junit.jupiter.api.Assertions.*;

import java.math.BigDecimal;

import com.speedrun.flooringco.dto.Tax;

import org.junit.jupiter.api.AfterAll;
import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

public class TaxDaoImplTest {
    
    TaxDaoImpl dao = new TaxDaoImpl();

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
	void getTaxInfo() throws Exception{
        String stateAbbreviation = "TX"; 
        Tax taxObject = dao.getTaxInfo(stateAbbreviation);
        assertEquals(taxObject.getStateAbbreviation(), (stateAbbreviation));
        assertEquals(taxObject.getStateName(), ("Texas"));
        assertEquals(taxObject.getTaxRate(), new BigDecimal("4.45"));
	}
}
