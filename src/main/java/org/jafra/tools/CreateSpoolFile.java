/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package org.jafra.tools;

////////////////////////////////////////////////////////////////////////////////// // 

import com.ibm.as400.access.*;
import java.io.FileInputStream;
import java.io.InputStream;

// Create Spooled File example. This program creates a spooled file on the AS/400 
// and echoes to it the contents of a file selected by the user. // 
// For more information about AS/400 Printing, refer to : 
// * OS/400 Printer Device Programming, SC41-3713 
// * IBM AS/400 Printing IV Redbook, GG24-4389
// 
// Call syntax: 
// CreateSpoolFile 
// CreateSpoolFile system 
// CreateSpoolFile system outputQueue 
// 
// For example: 
// java CreateSpoolFile 
// java CreateSpoolFile MySystem 
// java CreateSpoolFile MySystem /QSYS.LIB/QUSRSYS.LIB/PRT01.OUTQ // 
// Note: If an output queue is not specified, the default output queue 
// "/QSYS.LIB/QUSRSYS.LIB/PRT01.OUTQ" is used. //
// Note: Since the contents of the spooled file is ASCII, the generated 
// spooled file cannot be viewed via the WRKSPLF command on the AS/400. 
// However, it can be spooled to a personal computer printer or displayed by 
// a viewer such as the AFP viewer shipped with Client Access/400. 
// 
////////////////////////////////////////////////////////////////////////////////// // 
// This source is an example of AS/400 Toolbox for Java "SpooledFileOutputStream".
// IBM grants you a nonexclusive license to use this as an example
// from which you can generate similar function tailored to 
// your own specific needs.
// 
// This sample code is provided by IBM for illustrative purposes 
// only. These examples have not been thoroughly tested under all 
// conditions. IBM, therefore, cannot guarantee or imply 
// reliability, serviceability, or function of these programs. 
// 
// All programs contained herein are provided to you "AS IS" 
// without any warranties of any kind. The implied warranties of 
// merchantablility and fitness for a particular purpose are 
// expressly disclaimed. 
// 
// AS/400 Toolbox for Java 
// (C) Copyright IBM Corp. 1997 
// All rights reserved. 
// US Government Users Restricted Rights - 
// Use, duplication, or disclosure restricted 
// by GSA ADP Schedule Contract with IBM Corp. 
// 
//////////////////////////////////////////////////////////////////////////////////

/**
 *
 * @author Administrador
 */
public class CreateSpoolFile {
    
    private static final String DEFAULT_OUTQ = "/QSYS.LIB/QGPL.LIB/";
    private AS400 as400 = new AS400();
    private String fileName;
    private String printer;

    public CreateSpoolFile(String fileName, String printer) {
        this.fileName = fileName;
        this.printer = printer;
    }
    
    
    public void sendToPrint(){
        OutputQueue outputQueue; 
        
        // Create an AS/400 object using the AS/400 system name if it was 
        // specified. Otherwise, create a default AS/400 object. 
        as400 = new AS400("172.16.20.136", "consulta", "consulta"); 
        
        // Otherwise, use the default. 
        outputQueue = new OutputQueue(as400, DEFAULT_OUTQ + printer +".OUTQ");
        
        try{
            InputStream in;
            SpooledFileOutputStream out;
            SpooledFile spooledFile;
            PrintParameterList parms = new PrintParameterList();
            byte[] buf = new byte[2048];
            int bytesRead;
            
            //select a file to echo to the spooled file
            //FileDialog fd = new FileDialog(new Frame());
            //fd.setVisible(true);
            if(fileName == null)
                System.exit(0);
            
            //Create a input stream for the file
            in = new FileInputStream(fileName);
            
            // create a PrintParameterList with the values that we want 
            // to override from the default printer file...we will override 
            // the output queue and the copies value. 
            parms.setParameter(PrintObject.ATTR_COPIES, 1); 
            parms.setParameter(PrintObject.ATTR_OUTPUT_QUEUE, outputQueue.getPath()); 
            
            // create the output stream and write to the file 
            out = new SpooledFileOutputStream(as400, parms, null, null); 
            
            // read from the inputstream until end of stream, echoing all data 
            // to the spooled file output stream. 
            do { 
                bytesRead = in.read(buf); 
                if (bytesRead != -1) 
                    out.write(buf, 0, bytesRead); 
            } while (bytesRead != -1); 
            
            // close the spooled file 
            out.close(); 
            
            // get a reference to the new spooled file 
            spooledFile = out.getSpooledFile(); 
            
            
        }catch (Exception e) { 
            // Handle error. 
            System.out.println("Exception occured while creating the spooled file."); 
            System.out.println(e); 
        }
    }

    public String getFileName() {
        return fileName;
    }

    public void setFileName(String fileName) {
        this.fileName = fileName;
    }
    
    
}
