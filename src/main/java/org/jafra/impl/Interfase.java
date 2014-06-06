/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package org.jafra.impl;

import java.io.File;
import java.io.FileWriter;
import java.io.IOException;
import java.io.PrintWriter;
import org.jafra.entities.Document;
import org.jafra.interfases.IConfigurable;

/**
 * Creamos interfases para enviar a adaia en archivos fisicos
 * @author Jesús Armando Garcia Quiñones - Jueser <jesus_quinonez@jafra.com.mx>
 */
public class Interfase implements IConfigurable{
    private final Document document;

    public Interfase(Document document) {
        this.document = document;
    }   
    
    /**
     * Creamos una TREXPORD DUMMY para las devoluciones
     */
    public void createTRExpord() {

        try {
            try ( 
                    FileWriter fos = new FileWriter(_PATH_FILES + document.getDocumentName().trim() + _EXT_FILES); 
                    PrintWriter dos = new PrintWriter(fos)) {
                
                StringBuilder sb = new StringBuilder();
                sb.append("OECA|MO|").append(document.getOrder().trim());
                sb.append("-").append(document.getCostCenter().trim()).append("|");
                sb.append("01|000001||OFSP|||20400816|20400816|1646|S||MR01|||E|");
                                
                dos.println(sb.toString());
                sb.setLength(0);
                sb.append("OELI|MO|").append(document.getOrder().trim());
                 sb.append("-").append(document.getCostCenter().trim());
                sb.append("|000000001|MP|000000001|UD|00000001|000000000|0000000||||||");
                dos.println(sb.toString());
                
            }
        } catch (IOException e) {
            System.out.println("Error Printing Tab Delimited File");
        }
    }
    
    /**
     * Borramos la intefase fisicamente
     * @param fileName 
     */
    public void delete(String fileName){
        File file = new File(_PATH_FILES + fileName + _EXT_FILES);
        file.delete();
    }
}
