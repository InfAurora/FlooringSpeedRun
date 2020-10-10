package com.speedrun.flooringco.dto;

import java.math.BigDecimal;
import java.util.Objects;

public class Tax {
    
    private String stateAbbreviation;
    private String stateName;
    private BigDecimal taxRate;


    public Tax(String stateAbbreviation, String stateName, BigDecimal taxRate) {
        this.stateAbbreviation = stateAbbreviation;
        this.stateName = stateName;
        this.taxRate = taxRate;
    }

    public String getStateAbbreviation() {
        return this.stateAbbreviation;
    }

    public void setStateAbbreviation(String stateAbbreviation) {
        this.stateAbbreviation = stateAbbreviation;
    }

    public String getStateName() {
        return this.stateName;
    }

    public void setStateName(String stateName) {
        this.stateName = stateName;
    }

    public BigDecimal getTaxRate() {
        return this.taxRate;
    }

    public void setTaxRate(BigDecimal taxRate) {
        this.taxRate = taxRate;
    }

    @Override
    public boolean equals(Object o) {
        if (o == this)
            return true;
        if (!(o instanceof Tax)) {
            return false;
        }
        Tax tax = (Tax) o;
        return Objects.equals(stateAbbreviation, tax.stateAbbreviation) && Objects.equals(stateName, tax.stateName) && Objects.equals(taxRate, tax.taxRate);
    }

    @Override
    public int hashCode() {
        return Objects.hash(stateAbbreviation, stateName, taxRate);
    }

    @Override
    public String toString() {
        return "{" +
            " stateAbbreviation='" + getStateAbbreviation() + "'" +
            ", stateName='" + getStateName() + "'" +
            ", taxRate='" + getTaxRate() + "'" +
            "}";
    }
}
