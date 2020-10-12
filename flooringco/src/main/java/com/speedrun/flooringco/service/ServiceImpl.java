package com.speedrun.flooringco.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import java.math.BigDecimal;
import java.math.RoundingMode;

import com.speedrun.flooringco.dao.FlooringPersistanceException;
import com.speedrun.flooringco.dao.OrderDao;
import com.speedrun.flooringco.dao.ProductDao;
import com.speedrun.flooringco.dao.TaxDao;
import com.speedrun.flooringco.dto.Product;
import com.speedrun.flooringco.dto.Tax;

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

    public Product getProductInfo(String productType) throws FlooringPersistanceException{
        Product product = productDao.getProductInfo(productType);
        return product;
    }

    public Tax getTaxInfo(String stateAbbreviation) throws FlooringPersistanceException {
        Tax tax = taxDao.getTaxInfo(stateAbbreviation);
        return tax;
    }

    public BigDecimal getTotalMaterialCost(Product costPerSquareFoot, BigDecimal area) {
        BigDecimal totalMaterialCost = area.multiply(costPerSquareFoot.getCostPerSquareFoot());
        return totalMaterialCost;
    }

    public BigDecimal getTotalLaborCost(Product laborCostPerSquareFoot, BigDecimal area) {
        BigDecimal totalLaborCost = area.multiply(laborCostPerSquareFoot.getLaborCostPerSquareFoot());
        return totalLaborCost;
    }

    public BigDecimal getTotalTax(Tax taxRate, BigDecimal totalMaterialCost,  BigDecimal totalLaborCost) {
        BigDecimal totalTax = (totalMaterialCost.add(totalLaborCost)).multiply(taxRate.getTaxRate()
            .divide(new BigDecimal("100"))).setScale(2, RoundingMode.HALF_UP);
        return totalTax;
    }

    public BigDecimal getTotal(BigDecimal totalTax, BigDecimal totalMaterialCost,  BigDecimal totalLaborCost) {
        BigDecimal total = totalMaterialCost.add(totalLaborCost).add(totalTax);
        return total;
    }
}
