/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package org.jafra.services;

import org.jafra.entities.Product;
import org.jafra.impl.ApplicationConfig;
import org.jafra.interfases.ProductRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.SpringApplication;
import org.springframework.context.ConfigurableApplicationContext;

/**
 *
 * @author Jesús Armando Garcia Quiñones - Jueser <jesus_quinonez@jafra.com.mx>
 */
public class ProductService {
    @Autowired
    private final ProductRepository productRepository;

    public ProductService() {
        ConfigurableApplicationContext ctx1 = SpringApplication.run(ApplicationConfig.class);
        productRepository =  ctx1.getBean(ProductRepository.class);
    }
    
    
    public Product getProductData(String producRef){
        return productRepository.findByReference(producRef);
    }
    
}
