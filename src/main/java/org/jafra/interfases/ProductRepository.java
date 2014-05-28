/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package org.jafra.interfases;

import org.jafra.entities.Product;
import org.springframework.data.repository.CrudRepository;

/**
 *
 * @author Jesús Armando Garcia Quiñones - Jueser <jesus_quinonez@jafra.com.mx>
 */
public interface ProductRepository extends CrudRepository<Product, Long>{
    
    //public List<Product> findArts();
}
