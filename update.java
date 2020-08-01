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
public class update {
     sambungan konek = new sambungan ();

    public void update(String nik,String nama,String jabatan,String alamat,String email,String notlp) {

        try {
            konek.koneksi();
            java.sql.Statement statement = konek.con.createStatement();

            String sql_nama = "update karyawandataa set nama = '" + nama + "'where nik = '" + nik + "'";
            String sql_alamat = "update karyawandataa set alamat = '" + alamat + "'where nik = '" + nik + "'";
            String sql_jbt = "update karyawandataa set jabatan = '" + jabatan + "'where nik= '" + nik + "'";
            String sql_em = "update karyawandataa set email = '" + email + "'where nama = '" + nama + "'";
            String sql_notlp = "update karyawandataa set no_telp = '" + notlp + "'where alamat = '" + alamat + "'";
            String sql_nik = "update karyawandataa set nik = '" + nik + "'where nama = '" + nama + "'";

            statement.executeUpdate(sql_em);
            statement.executeUpdate(sql_notlp);
            statement.executeUpdate(sql_nama);
            statement.executeUpdate(sql_alamat);
            statement.executeUpdate(sql_nik);
            statement.executeUpdate(sql_jbt);
            
            statement.close();

            JOptionPane.showMessageDialog(null, "Berhasil Diubah");
        } catch (Exception ex) {
            JOptionPane.showMessageDialog(null, ex);
        }
    }
    
}
