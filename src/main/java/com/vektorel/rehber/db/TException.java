/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package com.vektorel.rehber.db;

/**
 *
 * @author eğitmen
 */
public class TException extends Exception{

    private String mesaj;
    
    public TException(String mesaj) {
        super(mesaj);
        this.mesaj=mesaj;
    }

    public String getMesaj() {
        return mesaj;
    }
    
    
}
