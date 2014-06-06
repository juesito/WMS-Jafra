/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package org.jafra.entities;

import java.text.SimpleDateFormat;
import java.util.Calendar;

/**
 * Documentos que sirven como interfases para enviar a adaia
 * @author Jesús Armando Garcia Quiñones - Jueser <jesus_quinonez@jafra.com.mx>
 */
public class Document {
    private String order;
    private String costCenter;
    private String documentName;

    public Document(String order, String costCenter, String documentName) {
        this.order = order;
        this.costCenter = costCenter;
        this.documentName = documentName;
    }

    public Document(String order, String costCenter) {
        Calendar cal = Calendar.getInstance();
        SimpleDateFormat sdf = new SimpleDateFormat("yyyyMMddhhmmss");
        this.order = order;
        this.costCenter = costCenter;
        this.documentName = "TREXPORD" + order.trim() + costCenter.trim()+ "." + sdf.format(cal.getTime());
    }
    
    

    public String getOrder() {
        return order;
    }

    public void setOrder(String order) {
        this.order = order;
    }

    public String getCostCenter() {
        return costCenter;
    }

    public void setCostCenter(String costCenter) {
        this.costCenter = costCenter;
    }

    public String getDocumentName() {
        return documentName;
    }

    public void setDocumentName(String documentName) {
        this.documentName = documentName;
    }

    @Override
    public String toString() {
        return "Document{" + "order=" + order + ", costCenter=" + costCenter + ", documentName=" + documentName + '}';
    }
    
    
    
}
