/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package org.jafra.tools;

import java.io.BufferedWriter;
import java.io.FileWriter;
import java.io.IOException;
import java.util.Calendar;
import javax.print.Doc;
import javax.print.DocFlavor;
import javax.print.DocPrintJob;
import javax.print.PrintException;
import javax.print.PrintService;
import javax.print.PrintServiceLookup;
import javax.print.SimpleDoc;
import org.jafra.interfases.IDesign;

/**
 *
 * @author Jesús Armando Garcia Quiñones - Jueser <jesus_quinonez@jafra.com.mx>
 */
public class Printer implements IDesign {

    private String printerName;
    private String streamToPrinter;

    public Printer(String printerName) {
        this.printerName = printerName;
    }

    public void print(String streamToPrinter) {
        this.streamToPrinter = streamToPrinter;

        if (!printerName.equals(_LOCAL_PRINTER)) {
            CreateSpoolFile spf = new CreateSpoolFile(saveFileToPrint(), this.printerName);
            spf.sendToPrint();

        }else{
            this.printLocalMode();
        }

    }

    public String getPrinterName() {
        return printerName;
    }

    public void setPrinterName(String printerName) {
        this.printerName = printerName;
    }

    public String getStreamToPrinter() {
        return streamToPrinter;
    }

    public void setStreamToPrinter(String streamToPrinter) {
        this.streamToPrinter = streamToPrinter;
    }

    /**
     * Guardamos el archivo
     *
     * @return
     */
    private String saveFileToPrint() {
        String fileName = "c:\\Temp\\" + Calendar.getInstance().getTimeInMillis() + ".prn";
        try {
            BufferedWriter out = new BufferedWriter(new FileWriter(fileName));
            out.write(this.streamToPrinter);
            out.close();
        } catch (IOException e) {
            System.out.println("Exception ");
        }
        return fileName;
    }

    /**
     * Proceso para imprimir en una impresora de windows
     */
    private void printLocalMode() {
        PrintService printService = PrintServiceLookup.lookupDefaultPrintService();

            
        //Convertimos la cadena a bytes
        byte[] by;
        by = this.streamToPrinter.getBytes();
        DocFlavor flavor = DocFlavor.BYTE_ARRAY.AUTOSENSE;
        Doc doc = new SimpleDoc(by, flavor, null);

        try {
            DocPrintJob job = printService.createPrintJob();
                //PrintRequestAttributeSet pras = new
            //HashPrintRequestAttributeSet(); 
            //pras.add(new Copies(1));

            job.print(doc, null);

        } catch (PrintException pe) {
            pe.printStackTrace();
            System.out.println(pe.getMessage());
        }
    }

}
