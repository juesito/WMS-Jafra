package org.jafra.entities;

import java.io.Serializable;

import javax.persistence.Basic;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity(name="Product")
@Table(name="art")
public  class Product implements Serializable {


    @Column(name="artref",columnDefinition="char",length=16)
    @Basic
    private String itemId;


    @Column(name="NUMDIACALCAD",length=4)
    @Basic
    private int expireDay;


    @Column(name="artdes",columnDefinition="char",length=40)
    @Basic
    private String description;


    @Column(name="artcod")
    @Id
    @GeneratedValue(strategy=GenerationType.IDENTITY)
    private Long id;


    @Column(name="AGRTARART",columnDefinition="char",length=4)
    @Basic
    private String type;


    @Column(name="unimin",columnDefinition="char",length=4)
    @Basic
    private String unitMeasure;


    @Column(name="SITINI",columnDefinition="char",length=4)
    @Basic
    private String initialSituation;

    public Product(){

    }


   public String getItemId() {
        return this.itemId;
    }


  public void setItemId (String itemId) {
        this.itemId = itemId;
    }



   public int getExpireDay() {
        return this.expireDay;
    }


  public void setExpireDay (int expireDay) {
        this.expireDay = expireDay;
    }



   public String getDescription() {
        return this.description;
    }


  public void setDescription (String description) {
        this.description = description;
    }



   public Long getId() {
        return this.id;
    }


  public void setId (Long id) {
        this.id = id;
    }



   public String getType() {
        return this.type;
    }


  public void setType (String type) {
        this.type = type;
    }



   public String getUnitMeasure() {
        return this.unitMeasure;
    }


  public void setUnitMeasure (String unitMeasure) {
        this.unitMeasure = unitMeasure;
    }



   public String getInitialSituation() {
        return this.initialSituation;
    }


  public void setInitialSituation (String initialSituation) {
        this.initialSituation = initialSituation;
    }

}

