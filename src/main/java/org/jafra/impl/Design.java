/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package org.jafra.impl;

import org.jafra.entities.Label;
import org.jafra.interfases.IDesign;

/**
 *
 * @author Jesús Armando Garcia Quiñones - Jueser <jesus_quinonez@jafra.com.mx>
 */
public class Design implements IDesign{

    private String type;
    private String template;
    private Label label;
    private Integer numberOfLabels;
    
    public Design() {
    }
    
    public Design(String type, Label label, Integer numberOfLabels){
        this.type = type;
        this.label = label;
        this.numberOfLabels = numberOfLabels;
    }
    
    public void create(){
        if(type.equals(_DEVOLUTION_TYPE)){
            this.template = _DEVOLUTION_TEMPLATE;
            this.createDevolutionDesign();
        }
    }
    
    
    private void createDevolutionDesign(){
        String barCode = "";
        
        if (label.getItemId().trim().length() < 12) {
            barCode = barCode  + label.getItemId();
            //barCode = barCode + ">6" + label.getItemId().trim();
        } else {
            barCode = barCode + label.getItemId().trim();
            //barCode = barCode + label.getItemId().trim().substring(0, label.getItemId().trim().length() - 1) + ">6" + label.getItemId().trim().substring(label.getItemId().trim().length() - 1);
            //barCode = barCode + label.getItemId().trim().substring(0, label.getItemId().trim().length() - 1) + ">6" + label.getItemId().trim().substring(label.getItemId().trim().length() - 1);
        }
        
        this.template = this.template.replaceAll("v_code", label.getItemId());
        this.template = this.template.replaceAll("v_description", label.getDescription());
                this.template = this.template.replaceAll("v_lote", label.getBatch());
                this.template = this.template.replaceAll("v_nomina", label.getEmployeeId());
                this.template = this.template.replaceAll("v_OP", label.getOp());
                this.template = this.template.replaceAll("v_turno", label.getTurno());
        this.template = this.template.replaceAll("v_barcode", barCode);
        this.template = this.template.replaceAll("v_numberlabels", String.valueOf(numberOfLabels));
        
    }
    

    public String getType() {
        return type;
    }

    public void setType(String type) {
        this.type = type;
    }

    public String getTemplate() {
        return template;
    }

    public void setTemplate(String template) {
        this.template = template;
    }
    
    
    
}
