package com.vektorel.rehber.rehber;

import com.vektorel.rehber.rehber.gui.frmLogin;

/**
 * Hello world!
 *
 */
public class App {

    public static void main(String[] args) {         
        System.out.println(System.getProperty("java.class.path"));
        frmLogin l = new frmLogin();
        l.setLocationRelativeTo(null);
        l.show();
    }
}
