package com.speedrun.flooringco.dao;

import java.io.FileNotFoundException;
import java.io.FileReader;
import java.math.BigDecimal;
import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

import com.speedrun.flooringco.dto.Tax;

import org.springframework.stereotype.Component;

@Component
public class TaxDaoImpl implements TaxDao {

    String FILE = "Taxes.txt";
    String DELIMITER = ",";
    Map<String, Tax> taxMap = new HashMap<>();

    @Override
    public Tax getTaxInfo(String stateAbbreviation) throws FlooringPersistanceException{
        loadTax();
        Tax taxObject = taxMap.get(stateAbbreviation);

        return taxObject;
    }
    
    private Tax unmarshallTax(String lineInFile) {
        String[] parts = lineInFile.split(DELIMITER);
        Tax tax = new Tax();
        tax.setStateAbbreviation(parts[0]);
        tax.setStateName(parts[1]);
        tax.setTaxRate(new BigDecimal(parts[2]));

        return tax;
    }
    
    private void loadTax() throws FlooringPersistanceException{
        Scanner sc = null;
        try {
            sc = new Scanner(new FileReader(FILE));
        } catch (FileNotFoundException e) {
            throw new FlooringPersistanceException("Taxes file not found!!!");
        }
        sc.nextLine();
        while (sc.hasNextLine()) {
            String currentLine = sc.nextLine();
            Tax unmarshalledTax = unmarshallTax(currentLine);
            String stateAbbreviation = unmarshalledTax.getStateAbbreviation();
            taxMap.put(stateAbbreviation, unmarshalledTax);
        }
        sc.close();
    }
}
