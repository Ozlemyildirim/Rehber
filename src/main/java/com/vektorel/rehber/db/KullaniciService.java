/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package com.vektorel.rehber.db;

import com.vektorel.rehber.db.entity.Kullanici;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.ArrayList;
import java.util.List;

/**
 *
 * @author eğitmen
 */
public class KullaniciService {

    public boolean ekle(String kullaniciAdi, String sifre) {
        String sql = "INSERT INTO gnl_kullanici(uname, pwd) VALUES ('" + kullaniciAdi + "' , '" + sifre + "'";
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

    public boolean ekle(Kullanici kullanici) {
        String sql = "INSERT INTO gnl_kullanici(uname, pwd,kisi_id) VALUES (?,?,?)";
        try {
            DBConnection bConnection = new DBConnection();
            Connection con = bConnection.baglantiBaslat();

            PreparedStatement st = con.prepareStatement(sql);
            st.setString(1, kullanici.getUsername());
            st.setString(2, kullanici.getPassword());
            st.setLong(3, kullanici.getKisiId());
            st.executeUpdate();
            bConnection.baglantiSonlandir();
            return true;
        } catch (SQLException ex) {
            ex.printStackTrace();
        }
        return false;
    }

    public boolean getir(String kullaniciAdi, String sifre) throws TException {
        String sql = " select * from gnl_kullanici where uname='" + kullaniciAdi + "' and pwd='" + sifre + "' ";
        try {
            DBConnection bConnection = new DBConnection();
            Connection con = bConnection.baglantiBaslat();

            Statement statement = con.createStatement();
            ResultSet rs = statement.executeQuery(sql);
            System.out.println(sql);
            bConnection.baglantiSonlandir();
            if (rs.next()) {
                return true;
            }
        } catch (SQLException ex) {
            ex.printStackTrace();
        } catch (Exception e) {
            throw new TException("Veritabanına Bağlanılamadı");
        }
        return false;
    }

    public List<Kullanici> getir() {
        List<Kullanici> kullaniciListe = new ArrayList<Kullanici>();
        String sql = " select * from gnl_kullanici ";
        try {
            DBConnection bConnection = new DBConnection();
            Connection con = bConnection.baglantiBaslat();

            Statement statement = con.createStatement();
            ResultSet rs = statement.executeQuery(sql);
            System.out.println(sql);
            bConnection.baglantiSonlandir();

            while (rs.next()) {
                Kullanici k = new Kullanici();
                k.setId(rs.getLong("id"));
                k.setUsername(rs.getString("uname"));
                k.setPassword(rs.getString("pwd"));
                k.setKisiId(rs.getLong("kisi_id"));
                kullaniciListe.add(k);
            }

        } catch (Exception ex) {
            ex.printStackTrace();
        }

        return kullaniciListe;
    }
}
