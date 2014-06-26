/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package org.jafra.wms;

import java.util.Iterator;
import org.jafra.entities.Product;
import org.jafra.impl.ApplicationConfig;
import org.jafra.repositories.ProductRepository;
import org.springframework.boot.SpringApplication;
import org.springframework.context.ConfigurableApplicationContext;

/**
 *
 * @author Jesús Armando Garcia Quiñones - Jueser <jesus_quinonez@jafra.com.mx>
 */
public class WmsJafra {

    static ProductRepository productRepository;
    public static void mainTwo(String[] args) {

        ConfigurableApplicationContext ctx1 = SpringApplication.run(ApplicationConfig.class);
        productRepository =  ctx1.getBean(ProductRepository.class);

                
        Iterator<Product> iter = productRepository.findAll().iterator();
        while(iter.hasNext()){
            Product product = iter.next();
                        System.out.println("Producto --> " + product.toString());
        }
        
        System.out.println("Termino, Gracias  " );

        
    }

}
