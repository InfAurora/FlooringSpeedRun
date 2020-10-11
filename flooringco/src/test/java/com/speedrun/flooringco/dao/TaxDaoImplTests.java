package com.speedrun.flooringco.dao;

import static org.junit.jupiter.api.Assertions.*;

import com.speedrun.flooringco.dto.Tax;

import org.junit.jupiter.api.AfterAll;
import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

public class TaxDaoImplTests {
    
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
	void getTaxInfo() {
        String stateAbbreviation = "TX"; 
        // Tax taxObject = dao.getTaxInfo(stateAbbreviation);
        // assertTrue(taxObject.getStateAbbreviation().equals(stateAbbreviation));
        // assertTrue(taxObject.getStateName().equals("Texas"));
        // assertTrue(taxObject.getTaxRate().equals("4.45"));
	}
}
