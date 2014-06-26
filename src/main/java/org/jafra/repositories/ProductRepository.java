/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package org.jafra.repositories;

import org.jafra.entities.Product;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.CrudRepository;
import org.springframework.data.repository.query.Param;
import org.springframework.stereotype.Repository;

/**
 *
 * @author Jesús Armando Garcia Quiñones - Jueser <jesus_quinonez@jafra.com.mx>
 */
@Repository
public interface ProductRepository extends CrudRepository<Product, Long>{
    
    @Query("SELECT c FROM Product c WHERE trim(c.itemId) = :productReference")
    Product findByReference(@Param("productReference") String productReference);
}
