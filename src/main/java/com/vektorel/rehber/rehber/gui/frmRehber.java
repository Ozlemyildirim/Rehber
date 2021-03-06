/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package com.vektorel.rehber.rehber.gui;

import com.vektorel.rehber.db.KisiService;
import com.vektorel.rehber.db.KullaniciService;
import com.vektorel.rehber.db.entity.Kisi;
import com.vektorel.rehber.db.entity.Kullanici;
import java.util.List;
import javax.swing.JOptionPane;
import javax.swing.event.TableModelListener;
import javax.swing.table.DefaultTableModel;
import javax.swing.table.TableModel;

/**
 *
 * @author eğitmen
 */
public class frmRehber extends javax.swing.JFrame {

    String[] options = {"Evet", "Hayır"};

    /**
     * Creates new form frmRehber
     */
    public frmRehber(String kullanici) {
        initComponents();
        kisiDoldur();
        lblKullanici.setText("Hoşgeldin "+kullanici);
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jScrollPane1 = new javax.swing.JScrollPane();
        tblListe = new javax.swing.JTable();
        lblKullanici = new javax.swing.JLabel();
        jMenuBar1 = new javax.swing.JMenuBar();
        jMenu1 = new javax.swing.JMenu();
        miKullaniciListe = new javax.swing.JMenuItem();
        miKullaniciEkle = new javax.swing.JMenuItem();
        jMenu2 = new javax.swing.JMenu();
        miKisiListesi = new javax.swing.JMenuItem();
        miKisiEkle = new javax.swing.JMenuItem();
        miKisiSil = new javax.swing.JMenuItem();
        miGuncelle = new javax.swing.JMenuItem();
        jMenu3 = new javax.swing.JMenu();
        miCikis = new javax.swing.JMenuItem();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setUndecorated(true);

        tblListe.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null}
            },
            new String [] {
                "Title 1", "Title 2", "Title 3", "Title 4"
            }
        ));
        jScrollPane1.setViewportView(tblListe);

        jMenu1.setText("Kullanıcı İşlemleri");

        miKullaniciListe.setAccelerator(javax.swing.KeyStroke.getKeyStroke(java.awt.event.KeyEvent.VK_F6, 0));
        miKullaniciListe.setText("Kullanıcı Listesi");
        miKullaniciListe.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                miKullaniciListeActionPerformed(evt);
            }
        });
        jMenu1.add(miKullaniciListe);

        miKullaniciEkle.setText("Kullanıcı Ekle");
        miKullaniciEkle.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                miKullaniciEkleActionPerformed(evt);
            }
        });
        jMenu1.add(miKullaniciEkle);

        jMenuBar1.add(jMenu1);

        jMenu2.setText("Kişi İşlemleri");

        miKisiListesi.setAccelerator(javax.swing.KeyStroke.getKeyStroke(java.awt.event.KeyEvent.VK_F5, 0));
        miKisiListesi.setText("Kişi Listesi");
        miKisiListesi.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                miKisiListesiActionPerformed(evt);
            }
        });
        jMenu2.add(miKisiListesi);

        miKisiEkle.setText("Kişi Ekle");
        miKisiEkle.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                miKisiEkleActionPerformed(evt);
            }
        });
        jMenu2.add(miKisiEkle);

        miKisiSil.setText("Kişi Sil");
        miKisiSil.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                miKisiSilActionPerformed(evt);
            }
        });
        jMenu2.add(miKisiSil);

        miGuncelle.setText("Kişi Güncelle");
        miGuncelle.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                miGuncelleActionPerformed(evt);
            }
        });
        jMenu2.add(miGuncelle);

        jMenuBar1.add(jMenu2);

        jMenu3.setText("İşlemler");

        miCikis.setAccelerator(javax.swing.KeyStroke.getKeyStroke(java.awt.event.KeyEvent.VK_ESCAPE, 0));
        miCikis.setText("Çıkış");
        miCikis.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                miCikisActionPerformed(evt);
            }
        });
        jMenu3.add(miCikis);

        jMenuBar1.add(jMenu3);

        setJMenuBar(jMenuBar1);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jScrollPane1, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, 534, Short.MAX_VALUE)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(lblKullanici, javax.swing.GroupLayout.PREFERRED_SIZE, 201, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap())
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 486, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(lblKullanici, javax.swing.GroupLayout.DEFAULT_SIZE, 17, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void miKullaniciListeActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_miKullaniciListeActionPerformed
        kullaniciDoldur();
    }//GEN-LAST:event_miKullaniciListeActionPerformed

    private void miKisiListesiActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_miKisiListesiActionPerformed
        kisiDoldur();
    }//GEN-LAST:event_miKisiListesiActionPerformed

    private void miKisiEkleActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_miKisiEkleActionPerformed
        frmKisi kisi = new frmKisi(this, true);
        kisi.setLocationRelativeTo(this);
        kisi.show();
        kisiDoldur();
    }//GEN-LAST:event_miKisiEkleActionPerformed

    private void miKisiSilActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_miKisiSilActionPerformed
        if (tblListe.getSelectedRow() != -1) {
            int sonuc = JOptionPane.showOptionDialog(this, "Silmek İstediğinizden Emin misiniz?", "Silme Onay", 0, 2, null, options, null);
            if (sonuc == 0) {
                KisiService kisiService = new KisiService();
                kisiService.sil(Long.parseLong(tblListe.getValueAt(tblListe.getSelectedRow(), 0).toString()));
                kisiDoldur();
            }
        } else {
            JOptionPane.showMessageDialog(this, "Satır Seçiniz.","Uyarı",1);
        }
    }//GEN-LAST:event_miKisiSilActionPerformed

    private void miGuncelleActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_miGuncelleActionPerformed

        if (tblListe.getSelectedRow() != -1) {
            KisiService kisiService = new KisiService();
            Kisi kisi = kisiService.getir(Long.parseLong(tblListe.getValueAt(tblListe.getSelectedRow(), 0).toString()));
            frmKisi kisiGuncelle = new frmKisi(this, true, kisi);
            kisiGuncelle.setLocationRelativeTo(this);
            kisiGuncelle.show();
            kisiDoldur();
        } else {
            JOptionPane.showMessageDialog(this, "Satır Seçiniz.","Uyarı",1);
        }


    }//GEN-LAST:event_miGuncelleActionPerformed

    private void miCikisActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_miCikisActionPerformed
        int sonuc = JOptionPane.showOptionDialog(this, "Çıkmak İstediğinizden Emin misiniz?", "Çıkış Onay", 0, 2, null, options, null);
            if (sonuc == 0) {
                System.exit(sonuc);
            }
    }//GEN-LAST:event_miCikisActionPerformed

    private void miKullaniciEkleActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_miKullaniciEkleActionPerformed
       frmKullanici kullanici=new frmKullanici(this, true);
       kullanici.setLocationRelativeTo(this);
       kullanici.show();
       kullaniciDoldur();
    }//GEN-LAST:event_miKullaniciEkleActionPerformed
    /**
     * @param args the command line arguments
     */
    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JMenu jMenu1;
    private javax.swing.JMenu jMenu2;
    private javax.swing.JMenu jMenu3;
    private javax.swing.JMenuBar jMenuBar1;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JLabel lblKullanici;
    private javax.swing.JMenuItem miCikis;
    private javax.swing.JMenuItem miGuncelle;
    private javax.swing.JMenuItem miKisiEkle;
    private javax.swing.JMenuItem miKisiListesi;
    private javax.swing.JMenuItem miKisiSil;
    private javax.swing.JMenuItem miKullaniciEkle;
    private javax.swing.JMenuItem miKullaniciListe;
    private javax.swing.JTable tblListe;
    // End of variables declaration//GEN-END:variables

    private void kullaniciDoldur() {
        KullaniciService islemleri = new KullaniciService();
        List<Kullanici> liste = islemleri.getir();
        String[] columnNames = new String[3];
        columnNames[0] = "No";
        columnNames[1] = "Kullanıcı Adı";
        columnNames[2] = "Şifre";

        String[][] data = new String[liste.size()][3];

        for (int i = 0; i < liste.size(); i++) {
            Kullanici kullanici = liste.get(i);
            data[i][0] = kullanici.getId().toString();
            data[i][1] = kullanici.getUsername();
            data[i][2] = kullanici.getPassword();
        }
        tblListe.setModel(new DefaultTableModel(data, columnNames));
    }

    private void kisiDoldur() {

        KisiService kisiService = new KisiService();
        List<Kisi> liste = kisiService.getir();
        String[] columnNames = new String[6];
        columnNames[0] = "No";
        columnNames[1] = "Adı";
        columnNames[2] = "Soyadı";
        columnNames[3] = "Doğum Tarihi";
        columnNames[4] = "TC Kimlik No";
        columnNames[5] = "Adres";

        String[][] data = new String[liste.size()][6];

        for (int i = 0; i < liste.size(); i++) {
            Kisi kisi = liste.get(i);
            data[i][0] = kisi.getId().toString();
            data[i][1] = kisi.getAd();
            data[i][2] = kisi.getSoyad();
            data[i][3] = kisi.getDogumTarihi().toLocaleString();
            data[i][4] = kisi.getTckn();
            data[i][5] = kisi.getAdres();
        }
        tblListe.setModel(new DefaultTableModel(data, columnNames));
    }
}
