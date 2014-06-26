/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package org.jafra.services;

import org.jafra.entities.Product;
import org.jafra.impl.ApplicationConfig;
import org.jafra.repositories.ProductRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.SpringApplication;
import org.springframework.context.ConfigurableApplicationContext;
import org.springframework.stereotype.Component;

/**
 *
 * @author Jesús Armando Garcia Quiñones - Jueser <jesus_quinonez@jafra.com.mx>
 */
@Component
public class ProductService {
    
    @Autowired
    private ProductRepository productRepository;
    
    public ProductRepository getProductRepository() {
        return productRepository;
    }

    public void setProductRepository(ProductRepository productRepository) {
        this.productRepository = productRepository;
    }
    
    
    
}
