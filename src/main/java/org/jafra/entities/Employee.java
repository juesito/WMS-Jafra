package org.jafra.entities;

import java.io.Serializable;

import javax.persistence.Basic;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name="OPERATOR")
public  class Employee implements Serializable {


    @Column(name="REFERENCE",columnDefinition="char")
    @Basic
    private String nick;


    @Column(name="PASSWORD",columnDefinition="char")
    @Basic
    private String password;


    @Column(name="id")
    @Id
    private Long id;


    @Column(name="USERNAME",columnDefinition="char")
    @Basic
    private String userName;

    public Employee(){

    }


   public String getNick() {
        return this.nick;
    }


  public void setNick (String nick) {
        this.nick = nick;
    }



   public String getPassword() {
        return this.password;
    }


  public void setPassword (String password) {
        this.password = password;
    }



   public Long getId() {
        return this.id;
    }


  public void setId (Long id) {
        this.id = id;
    }



   public String getUserName() {
        return this.userName;
    }


  public void setUserName (String userName) {
        this.userName = userName;
    }

}

