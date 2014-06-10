/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package org.jafra.entities;

/**
 *
 * @author Jesús Armando Garcia Quiñones - Jueser <jesus_quinonez@jafra.com.mx>
 */
public class Label {
    
    private String itemId;
    private String description;
    private String batch;
    private String barcode;
    private String employeeId;
    private String op;
    private String turno;
    private String eanCode;
    private double quantity;

    public Label() {
    }

    public Label(String itemId, String description, double quantity) {
        this.itemId = itemId;
        this.description = description;
        this.quantity = quantity;
    }

    public Label(String itemId, String description, String batch, double quantity) {
        this.itemId = itemId;
        this.description = description;
        this.batch = batch;
        this.quantity = quantity;
    }

        
    public Label(String itemId, String description, String batch, String barcode, String eanCode, double quantity) {
        this.itemId = itemId;
        this.description = description;
        this.batch = batch;
        this.barcode = barcode;
        this.eanCode = eanCode;
        this.quantity = quantity;
    }

    public Label(String itemId, String description, String batch, String employeeId, String op, String turno, double quantity) {
        this.itemId = itemId;
        this.description = description;
        this.batch = batch;
        this.employeeId = employeeId;
        this.op = op;
        this.turno = turno;
        this.quantity = quantity;
    }
    
    

    public String getItemId() {
        return itemId;
    }

    public void setItemId(String itemId) {
        this.itemId = itemId;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public String getBatch() {
        return batch;
    }

    public void setBatch(String batch) {
        this.batch = batch;
    }

    public String getBarcode() {
        return barcode;
    }

    public void setBarcode(String barcode) {
        this.barcode = barcode;
    }

    public String getEanCode() {
        return eanCode;
    }

    public void setEanCode(String eanCode) {
        this.eanCode = eanCode;
    }

    public double getQuantity() {
        return quantity;
    }

    public void setQuantity(double quantity) {
        this.quantity = quantity;
    }

    public String getEmployeeId() {
        return employeeId;
    }

    public void setEmployeeId(String employeeId) {
        this.employeeId = employeeId;
    }

    public String getOp() {
        return op;
    }

    public void setOp(String op) {
        this.op = op;
    }

    public String getTurno() {
        return turno;
    }

    public void setTurno(String turno) {
        this.turno = turno;
    }
    
    
    
}
