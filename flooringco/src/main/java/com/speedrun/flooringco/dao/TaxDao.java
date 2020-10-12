package com.speedrun.flooringco.dao;

import com.speedrun.flooringco.dto.Tax;

public interface TaxDao {
    public Tax getTaxInfo(String stateAbbreviation) throws FlooringPersistanceException;
}
