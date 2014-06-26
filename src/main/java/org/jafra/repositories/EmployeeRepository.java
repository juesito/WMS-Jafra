/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package org.jafra.repositories;

import org.jafra.entities.Employee;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.CrudRepository;
import org.springframework.data.repository.query.Param;
import org.springframework.stereotype.Repository;

/**
 *
 * @author Administrador
 */
@Repository
public interface EmployeeRepository extends CrudRepository<Employee, Long>{
    
    @Query("SELECT c FROM Employee c WHERE trim(nick) = :nick AND trim(password) = :password")
    public Employee login(@Param("nick")String nick, @Param("password")String password);
    
}
