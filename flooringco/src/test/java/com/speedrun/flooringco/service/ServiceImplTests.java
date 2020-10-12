package com.speedrun.flooringco.service;

import static org.junit.jupiter.api.Assertions.*;

import java.math.BigDecimal;

import com.speedrun.flooringco.dao.OrderDao;
import com.speedrun.flooringco.dao.ProductDao;
import com.speedrun.flooringco.dao.TaxDao;
import com.speedrun.flooringco.dto.Product;
import com.speedrun.flooringco.dto.Tax;

import org.junit.jupiter.api.AfterAll;
import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

public class ServiceImplTests {

    private OrderDao orderDao;
    private TaxDao taxDao;
    private ProductDao productDao;

    private ServiceImpl service = new ServiceImpl(orderDao, taxDao, productDao);
    private Product product;
    private Tax tax;
    private BigDecimal area;

    @BeforeAll
    static void initAll() {
    }

    @BeforeEach
    void init() {
        product = new Product();
        product.setProductType("Carpet");
        product.setCostPerSquareFoot(new BigDecimal("2.25"));
        product.setLaborCostPerSquareFoot(new BigDecimal("2.10"));

        tax = new Tax();
        tax.setStateAbbreviation("TX");
        tax.setStateName("Texas");
        tax.setTaxRate(new BigDecimal("4.45"));

        area = new BigDecimal("100");
    }
	
	@AfterEach
    void tearDown() {
    }

    @AfterAll
    static void tearDownAll() {
	}
    
    // pass through method, redundant test
    // @Test
    // void getProductInfo(String productType) throws FlooringPersistanceException{
    //     Product product = productDao.getProductInfo(productType);
    //     return product;
    // }

    // pass through method, redundant test
    // @Test
    // void getTaxInfo(String stateAbbreviation) throws FlooringPersistanceException {
    //     Tax tax = taxDao.getTaxInfo(stateAbbreviation);
    //     return tax;
    // }
    
    @Test
    void getTotalMaterialCost() {
        BigDecimal totalMaterialCost = service.getTotalMaterialCost(product, area);
        
        assertEquals(totalMaterialCost, new BigDecimal("0"));
    }

    @Test
    void getTotalLaborCost() {
        BigDecimal totalLaborCost = service.getTotalLaborCost(product, area);

        assertEquals(totalLaborCost, new BigDecimal("0"));
    }

    @Test
    void getTotalTax() {
        BigDecimal totalMaterialCost = service.getTotalMaterialCost(product, area);
        BigDecimal totalLaborCost = service.getTotalLaborCost(product, area);
        BigDecimal totalTax = service.getTotalTax(tax, totalMaterialCost, totalLaborCost);
        
        assertEquals(totalTax, new BigDecimal("0"));
    }

    @Test
    void getTotal() { 
        BigDecimal totalMaterialCost = service.getTotalMaterialCost(product, area);
        BigDecimal totalLaborCost = service.getTotalLaborCost(product, area);       
        BigDecimal totalTax = service.getTotalTax(tax, totalMaterialCost, totalLaborCost);
        BigDecimal total = service.getTotal(totalLaborCost, totalMaterialCost, totalTax);

        assertEquals(total, new BigDecimal("0"));
    }
}