/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package com.vektorel.rehber.db.entity;

/**
 *
 * @author eğitmen
 */
public class Kullanici {
    private Long id;
    private String username;
    private String password;
    private Long kisiId;

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getUsername() {
        return username;
    }

    public void setUsername(String username) {
        this.username = username;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    public Long getKisiId() {
        return kisiId;
    }

    public void setKisiId(Long kisiId) {
        this.kisiId = kisiId;
    }
}
