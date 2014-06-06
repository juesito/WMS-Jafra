/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package org.jafra.impl;

import java.io.FileInputStream;
import java.io.IOException;
import java.util.logging.Level;
import java.util.logging.Logger;
import org.apache.commons.net.ftp.FTPClient;
import org.jafra.interfases.IConfigurable;

/**
 * Clase FTP para envio y gestión de archivos via FTP 
 * @author Jesús Armando Garcia Quiñones - Jueser <jesus_quinonez@jafra.com.mx>
 */
public class FTP implements IConfigurable {

    private String fileUpload;
    private final FTPClient ftpClient;
    FileInputStream fis = null;

    public FTP() {
        ftpClient = new FTPClient();
        try {
            ftpClient.connect(_FTP_HOST);
            ftpClient.login(_USER_HOST, _PASSWORD_HOST);
        } catch (IOException ex) {
            Logger.getLogger(FTP.class.getName()).log(Level.SEVERE, null, ex);
        }
    }

    /**
     * Enviamos un archivo previamente cargado
     */
    public void sendFile() {
        try {

            ftpClient.setFileType(org.apache.commons.net.ftp.FTP.BINARY_FILE_TYPE, org.apache.commons.net.ftp.FTP.BINARY_FILE_TYPE);
            ftpClient.setFileTransferMode(org.apache.commons.net.ftp.FTP.BINARY_FILE_TYPE);

            fis = new FileInputStream(_PATH_FILES + fileUpload.trim() + _EXT_FILES);

            if (ftpClient.changeWorkingDirectory(_SERVER_DE_GESTION_DIRECTORY)) {
                ftpClient.storeFile(this.fileUpload.trim() + _EXT_FILES, fis);
            }

            fis.close();
            ftpClient.logout();
        } catch (IOException ex) {
            Logger.getLogger(FTP.class.getName()).log(Level.SEVERE, null, ex);
        }
    }
    
    /**
     * Enviamos un archivo por parametro
     * @param fileName
     */
    public void sendFile(String fileName) {
        try {

            ftpClient.setFileType(org.apache.commons.net.ftp.FTP.BINARY_FILE_TYPE, org.apache.commons.net.ftp.FTP.BINARY_FILE_TYPE);
            ftpClient.setFileTransferMode(org.apache.commons.net.ftp.FTP.BINARY_FILE_TYPE);

            fis = new FileInputStream(_PATH_FILES + fileName.trim() + _EXT_FILES);

            if (ftpClient.changeWorkingDirectory(_SERVER_DE_GESTION_DIRECTORY)) {
                ftpClient.storeFile(fileName.trim() + _EXT_FILES, fis);
            }

            fis.close();
            ftpClient.logout();
        } catch (IOException ex) {
            Logger.getLogger(FTP.class.getName()).log(Level.SEVERE, null, ex);
        }
    }

    public String getFileUpload() {
        return fileUpload;
    }

    public void setFileUpload(String fileUpload) {
        this.fileUpload = fileUpload;
    }

}
