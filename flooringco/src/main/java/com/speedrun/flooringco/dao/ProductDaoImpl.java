package com.speedrun.flooringco.dao;

import java.io.FileNotFoundException;
import java.io.FileReader;
import java.math.BigDecimal;
import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

import com.speedrun.flooringco.dto.Product;

public class ProductDaoImpl implements ProductDao {

    final private String DELIMITER = "::";
    final private String FILE = "Products.txt";
    private Map<String, Product> productMap = new HashMap<>();

    @Override
    public Product getProductInfo(String productType) throws FlooringPersistanceException{
        loadProduct();
        return null;
    }
    
    private Product unmarshallProduct(String lineInFile) {
        String[] parts = lineInFile.split(DELIMITER);
        Product product = new Product();
        product.setProductType(parts[0]);
        product.setCostPerSquareFoot(new BigDecimal(parts[1]));
        product.setLaborCostPerSquareFoot(new BigDecimal(parts[2]));

        return product;
    }

    private void loadProduct() throws FlooringPersistanceException{
        Scanner sc = null;
        try {
        sc = new Scanner(new FileReader(FILE));
        } catch (FileNotFoundException e) {
            throw new FlooringPersistanceException("Taxes file not found!!!");
        }
        while(sc.hasNextLine()) {
            String currentLine = sc.nextLine();
            Product unmarshalledProduct = unmarshallProduct(currentLine);
            String productType = unmarshalledProduct.getProductType()
            productMap.put(productType, unmarshalledProduct);
        }
        sc.close();
    }
}
