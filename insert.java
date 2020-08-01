/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package UASAPII;

import javax.swing.JOptionPane;

/**
 *
 * @author WINDOWS 10
 */
public class insert {
     sambungan konek = new sambungan ();

    public void insert(String nik,String nama,String jabatan,String alamat,String email,String notlp) {

        try {
            konek.koneksi();
            java.sql.Statement statement = konek.con.createStatement();
            String sql = "insert into karyawandataa values('" + nik + "','" + nama + "','" + jabatan + "','"+ alamat + "','" + email + "','" + notlp + "')";

            statement.executeUpdate(sql);
            statement.close();

            JOptionPane.showMessageDialog(null, "Berhasil Disimpan");
        } catch (Exception ex) {
            JOptionPane.showMessageDialog(null, ex);
        }
    }
}
