/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package dao;

import config.koneksi;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.JOptionPane;
import menu.menuUtama;
import model.model_login;
import service.service_login;
import view.Login;

/**
 *
 * @author fatiq
 */
public class DAO_login implements service_login{
    
    private Connection conn;
    
    public DAO_login(){
        conn = koneksi.getConnection();
    }
    
    @Override
    public void prosesLogin(model_login mod_log){
        PreparedStatement st = null;
        ResultSet rs = null;
        String Level2 = null;
        String sql = "SELECT * FROM penjual WHERE (id_penjual = '"+mod_log.getId_user()+"' "
                +"OR username = '"+mod_log.getNamaUser()+"' OR nama_penjual = '"+mod_log.getNamaUser()+"') "
                +"AND password = '"+Encrypt.getmd5java(mod_log.getPass())+"'";
        
        try{
            st = conn.prepareStatement(sql);
            rs = st.executeQuery();
            if (rs.next()){
                Level2 = rs.getString("level");
                
                Login lg = new  Login();
                model_login lgn = new model_login();
                
                lgn.setId_user(rs.getString("id_penjual"));
                lgn.setNamaUser(rs.getString("username"));
                lgn.setGambar(rs.getBlob("foto"));
                lgn.setLevel(Level2);
                
                if(Level2.equals("NotLogin")){
                    JOptionPane.showMessageDialog(null, "hak Akses Anda Telah Diblokir");
                    lg.tutup = false;
                } else {
                    menuUtama menu = new menuUtama(lgn);
                    menu.setVisible(true);
                    menu.revalidate();
                    lg.tutup = true;
                } 
                
            } else {
                JOptionPane.showMessageDialog(null, "Usesname atau Password Salah");
                Login lg = new  Login();
                lg.tutup = false;
            }
        } catch (SQLException ex) {
            Logger.getLogger(DAO_login.class.getName()).log(Level.SEVERE, null, ex);
        } finally{
            if(st != null){
                try{
                    st.close();
                } catch(SQLException ex){
                    Logger.getLogger(DAO_login.class.getName()).log(Level.SEVERE, null, ex);
                }
            }
        }
    }
}
