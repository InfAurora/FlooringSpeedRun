package com.speedrun.flooringco.dto;

import java.math.BigDecimal;
import java.util.Objects;

public class Order {
    
    private int orderNumber;
    private String customerName;
    private String state;
    private BigDecimal taxRate;
    private String productType;
    private BigDecimal area;
    private BigDecimal costPerSquareFoot;
    private BigDecimal laborCostPerSquareFoot;
    private BigDecimal totalMaterialCost;
    private BigDecimal totalLaborCost;
    private BigDecimal totalTax;
    private BigDecimal total;


    public Order() {
    }

    public Order(int orderNumber, String customerName, String state, BigDecimal taxRate, String productType, BigDecimal area, BigDecimal costPerSquareFoot, BigDecimal laborCostPerSquareFoot, BigDecimal totalMaterialCost, BigDecimal totalLaborCost, BigDecimal totalTax, BigDecimal total) {
        this.orderNumber = orderNumber;
        this.customerName = customerName;
        this.state = state;
        this.taxRate = taxRate;
        this.productType = productType;
        this.area = area;
        this.costPerSquareFoot = costPerSquareFoot;
        this.laborCostPerSquareFoot = laborCostPerSquareFoot;
        this.totalMaterialCost = totalMaterialCost;
        this.totalLaborCost = totalLaborCost;
        this.totalTax = totalTax;
        this.total = total;
    }

    public int getOrderNumber() {
        return this.orderNumber;
    }

    public void setOrderNumber(int orderNumber) {
        this.orderNumber = orderNumber;
    }

    public String getCustomerName() {
        return this.customerName;
    }

    public void setCustomerName(String customerName) {
        this.customerName = customerName;
    }

    public String getState() {
        return this.state;
    }

    public void setState(String state) {
        this.state = state;
    }

    public BigDecimal getTaxRate() {
        return this.taxRate;
    }

    public void setTaxRate(BigDecimal taxRate) {
        this.taxRate = taxRate;
    }

    public String getProductType() {
        return this.productType;
    }

    public void setProductType(String productType) {
        this.productType = productType;
    }

    public BigDecimal getArea() {
        return this.area;
    }

    public void setArea(BigDecimal area) {
        this.area = area;
    }

    public BigDecimal getCostPerSquareFoot() {
        return this.costPerSquareFoot;
    }

    public void setCostPerSquareFoot(BigDecimal costPerSquareFoot) {
        this.costPerSquareFoot = costPerSquareFoot;
    }

    public BigDecimal getLaborCostPerSquareFoot() {
        return this.laborCostPerSquareFoot;
    }

    public void setLaborCostPerSquareFoot(BigDecimal laborCostPerSquareFoot) {
        this.laborCostPerSquareFoot = laborCostPerSquareFoot;
    }

    public BigDecimal getTotalMaterialCost() {
        return this.totalMaterialCost;
    }

    public void setTotalMaterialCost(BigDecimal totalMaterialCost) {
        this.totalMaterialCost = totalMaterialCost;
    }

    public BigDecimal getTotalLaborCost() {
        return this.totalLaborCost;
    }

    public void setTotalLaborCost(BigDecimal totalLaborCost) {
        this.totalLaborCost = totalLaborCost;
    }

    public BigDecimal getTotalTax() {
        return this.totalTax;
    }

    public void setTotalTax(BigDecimal totalTax) {
        this.totalTax = totalTax;
    }

    public BigDecimal getTotal() {
        return this.total;
    }

    public void setTotal(BigDecimal total) {
        this.total = total;
    }

    @Override
    public boolean equals(Object o) {
        if (o == this)
            return true;
        if (!(o instanceof Order)) {
            return false;
        }
        Order order = (Order) o;
        return orderNumber == order.orderNumber && Objects.equals(customerName, order.customerName) && Objects.equals(state, order.state) && Objects.equals(taxRate, order.taxRate) && Objects.equals(productType, order.productType) && Objects.equals(area, order.area) && Objects.equals(costPerSquareFoot, order.costPerSquareFoot) && Objects.equals(laborCostPerSquareFoot, order.laborCostPerSquareFoot) && Objects.equals(totalMaterialCost, order.totalMaterialCost) && Objects.equals(totalLaborCost, order.totalLaborCost) && Objects.equals(totalTax, order.totalTax) && Objects.equals(total, order.total);
    }

    @Override
    public int hashCode() {
        return Objects.hash(orderNumber, customerName, state, taxRate, productType, area, costPerSquareFoot, laborCostPerSquareFoot, totalMaterialCost, totalLaborCost, totalTax, total);
    }

    @Override
    public String toString() {
        return "{" +
            " orderNumber='" + getOrderNumber() + "'" +
            ", customerName='" + getCustomerName() + "'" +
            ", state='" + getState() + "'" +
            ", taxRate='" + getTaxRate() + "'" +
            ", productType='" + getProductType() + "'" +
            ", area='" + getArea() + "'" +
            ", costPerSquareFoot='" + getCostPerSquareFoot() + "'" +
            ", laborCostPerSquareFoot='" + getLaborCostPerSquareFoot() + "'" +
            ", totalMaterialCost='" + getTotalMaterialCost() + "'" +
            ", totalLaborCost='" + getTotalLaborCost() + "'" +
            ", totalTax='" + getTotalTax() + "'" +
            ", total='" + getTotal() + "'" +
            "}";
    }
}
