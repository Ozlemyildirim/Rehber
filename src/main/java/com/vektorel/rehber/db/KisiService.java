/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package com.vektorel.rehber.db;

import com.vektorel.rehber.db.entity.Kisi;
import java.sql.Connection;
import java.sql.Date;
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
public class KisiService {

    public List<Kisi> getir() {
        List<Kisi> kisiListe = new ArrayList<Kisi>();
        String sql = " select * from gnl_kisi order by id asc ";
        try {
            DBConnection bConnection = new DBConnection();
            Connection con = bConnection.baglantiBaslat();

            Statement statement = con.createStatement();
            ResultSet rs = statement.executeQuery(sql);
            bConnection.baglantiSonlandir();

            while (rs.next()) {
                Kisi k = new Kisi();
                k.setId(rs.getLong("id"));
                k.setAd(rs.getString("ad"));
                k.setSoyad(rs.getString("soyad"));
                k.setAdres(rs.getString("adres"));
                k.setDogumTarihi(rs.getDate("dogum_tarihi"));
                k.setTckn(rs.getString("tckn"));
                kisiListe.add(k);
            }

        } catch (Exception ex) {
            ex.printStackTrace();
        }

        return kisiListe;
    }

    public void ekle(Kisi kisi) {
        String sql = "INSERT INTO gnl_kisi(ad, soyad,adres,dogum_tarihi,tckn) values (?,?,?,?,?) ";
        try {
            DBConnection bConnection = new DBConnection();
            Connection con = bConnection.baglantiBaslat();
            PreparedStatement stmt = con.prepareStatement(sql);
            stmt.setString(1, kisi.getAd());
            stmt.setString(2, kisi.getSoyad());
            stmt.setString(3, kisi.getAdres());
            Date dt = new Date(kisi.getDogumTarihi().getYear(), kisi.getDogumTarihi().getMonth(), kisi.getDogumTarihi().getDay());
            stmt.setDate(4, dt);
            stmt.setString(5, kisi.getTckn());
            stmt.executeUpdate();
            bConnection.baglantiSonlandir();
        } catch (SQLException ex) {
            ex.printStackTrace();
        }

    }

    public void sil(Long id) {
        String sql = " delete from gnl_kisi where id="+id;
        try {
            DBConnection bConnection = new DBConnection();
            Connection con = bConnection.baglantiBaslat();
            Statement statement = con.createStatement();
            statement.executeUpdate(sql);
            bConnection.baglantiSonlandir();    
        } catch (SQLException ex) {
            ex.printStackTrace();
        }    
    }

    public Kisi getir(long id) {
        Kisi kisi=new Kisi();
        String sql = " select * from gnl_kisi where id="+id;
        try {
            DBConnection bConnection = new DBConnection();
            Connection con = bConnection.baglantiBaslat();

            Statement statement = con.createStatement();
            ResultSet rs = statement.executeQuery(sql);
            System.out.println(sql);
            bConnection.baglantiSonlandir();

            while (rs.next()) {
                kisi.setId(rs.getLong("id"));
                kisi.setAd(rs.getString("ad"));
                kisi.setSoyad(rs.getString("soyad"));
                kisi.setAdres(rs.getString("adres"));
                kisi.setDogumTarihi(rs.getDate("dogum_tarihi"));
                kisi.setTckn(rs.getString("tckn"));
            }

        } catch (Exception ex) {
            ex.printStackTrace();
        }

        return kisi;
    }

    public void guncelle(Kisi k) {
          String sql = "update gnl_kisi set ad=? ,soyad=?, adres=?,dogum_tarihi=?,tckn=? where id=?";
        try {
            DBConnection bConnection = new DBConnection();
            Connection con = bConnection.baglantiBaslat();
            PreparedStatement stmt = con.prepareStatement(sql);
            stmt.setString(1, k.getAd());
            stmt.setString(2, k.getSoyad());
            stmt.setString(3, k.getAdres());
            Date dt = new Date(k.getDogumTarihi().getYear(), k.getDogumTarihi().getMonth(), k.getDogumTarihi().getDay());
            stmt.setDate(4, dt);
            stmt.setString(5, k.getTckn());
            stmt.setLong(6, k.getId());
            stmt.executeUpdate();
            bConnection.baglantiSonlandir();
        } catch (SQLException ex) {
            ex.printStackTrace();
        }

    }
}
