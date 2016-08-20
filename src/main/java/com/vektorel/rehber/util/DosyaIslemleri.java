/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package com.vektorel.rehber.util;

import java.io.FileInputStream;
import java.io.InputStream;
import java.util.Properties;

/**
 *
 * @author eğitmen
 */
public class DosyaIslemleri {

    public String propertiesDosyasiOku(FileEnum dosya, String key) {
        Properties prop = new Properties();
        InputStream input = null;
        try {
            input = new FileInputStream(System.getProperty("java.class.path")+"\\" + dosyayiBulEnumdan(dosya));
            prop.load(input);
            return prop.getProperty(key);
        } catch (Exception ex) {
            ex.printStackTrace();
        }
        return "";
    }

    private String dosyayiBulEnumdan(FileEnum enm) {
        switch (enm) {
            case AYARLAR:
                return "ayarlar.properties";
            case KULLANICILAR:
                return "kullanicilar.properties";
            case REHBER:
                return "rehber.properties";
        }
        return "";
    }
}
