/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package com.vektorel.rehber.db;

import java.sql.Connection;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;

/**
 *
 * @author eğitmen
 */
public class KullaniciIslemleri {

    public boolean ekle(String kullaniciAdi,String sifre) {
        String sql ="INSERT INTO gnl_kullanici(uname, pwd) VALUES ('"+kullaniciAdi+"' , '"+sifre+"'";
        try {
            DBConnection bConnection = new DBConnection();
            Connection con = bConnection.baglantiBaslat();

            Statement statement = con.createStatement();
            statement.executeUpdate(sql);
            bConnection.baglantiSonlandir();
            return true;
        } catch (SQLException ex) {
            ex.printStackTrace();
        }
        return false;
    }

 
    public boolean getir(String kullaniciAdi,String sifre) throws  TException{
        String sql=" select * from gnl_kullanici where uname='"+kullaniciAdi+"' and pwd='"+sifre+"' ";
                try {
            DBConnection bConnection = new DBConnection();
            Connection con = bConnection.baglantiBaslat();

            Statement statement = con.createStatement();
            ResultSet rs = statement.executeQuery(sql);
            System.out.println(sql);
            bConnection.baglantiSonlandir();
            if(rs.next())
                return true;
        }catch (SQLException ex) {
            ex.printStackTrace();
        }catch(Exception e){
             throw new TException("Veritabanına Bağlanılamadı");
        }
        return false;
    }
    
     
    public void getir() {
    }
}
