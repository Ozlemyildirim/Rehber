/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package com.vektorel.rehber.db;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

/**
 *
 * @author eğitmen
 */
public class DBConnection {

    private Connection connection;

    protected Connection baglantiBaslat(){
        try {
            Class.forName("org.postgresql.Driver");
            connection = DriverManager.getConnection("jdbc:postgresql://localhost:5432/rehber", "postgres", "root");            
            return connection;
        } catch (Exception e) {
            e.printStackTrace();
        }
        return null;
    }

    protected void baglantiSonlandir() {
        try {
            this.connection.close();
        } catch (SQLException ex) {
            ex.printStackTrace();
        }
    }
}
