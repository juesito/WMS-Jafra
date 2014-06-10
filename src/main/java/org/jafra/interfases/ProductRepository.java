/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package org.jafra.interfases;

import org.jafra.entities.Product;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.CrudRepository;
import org.springframework.data.repository.query.Param;

/**
 *
 * @author Jesús Armando Garcia Quiñones - Jueser <jesus_quinonez@jafra.com.mx>
 */
public interface ProductRepository extends CrudRepository<Product, Long>{
    
    @Query("select c from Product c where c.itemId = :productReference")
    public Product findByReference(@Param("productReference") String productReference);
}
