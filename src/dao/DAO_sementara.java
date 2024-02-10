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
import java.util.ArrayList;
import java.util.List;
import java.util.logging.Level;
import model.model_sementara;
import service.service_sementara;

/**
 *
 * @author fatiq
 */
public class DAO_sementara implements service_sementara{

    private Connection conn;
    
    public DAO_sementara(){
        conn = koneksi.getConnection();
    }

    @Override
    public void tambahData(model_sementara mod) {
        PreparedStatement st = null;
        String sql = "INSERT INTO sementara (kode_barang, nama_barang, jumlah, subtotal) VALUE (?,?,?,?)";
        try{
            st = conn.prepareStatement(sql);
            
            st.setString(1, mod.getKode_barang());
            st.setString(2, mod.getNama_barang());
            st.setInt(3, mod.getJumlah());
            st.setLong(4, mod.getSubtotal());
            
            st.executeUpdate();
        } catch (SQLException ex){
            java.util.logging.Logger.getLogger(DAO_sementara.class.getName()).log(Level.SEVERE,null,ex);
        } finally {
            if(st != null){
                try{
                    st.close();
                } catch (SQLException ex){
                    java.util.logging.Logger.getLogger(DAO_sementara.class.getName()).log(Level.SEVERE,null,ex);
                }
            }
        }
    }

    @Override
    public void hapusData(model_sementara mod) {
        PreparedStatement st = null;
        String sql = "DELETE FROM sementara "
                +"WHERE kode_barang = '"+mod.getKode_barang()+"' ";
        try{
            st = conn.prepareStatement(sql);
            st.executeUpdate();
        } catch (SQLException ex){
            java.util.logging.Logger.getLogger(DAO_sementara.class.getName()).log(Level.SEVERE,null,ex);
        } finally {
            if(st != null){
                try{
                    st.close();
                } catch (SQLException ex){
                    java.util.logging.Logger.getLogger(DAO_sementara.class.getName()).log(Level.SEVERE,null,ex);
                }
            }
        }
    }

    @Override
    public void hapusAll() {
        PreparedStatement st = null;
        String sql = "DELETE FROM sementara ";
        try{
            st = conn.prepareStatement(sql);
            st.executeUpdate();
        } catch (SQLException ex){
            java.util.logging.Logger.getLogger(DAO_sementara.class.getName()).log(Level.SEVERE,null,ex);
        } finally {
            if(st != null){
                try{
                    st.close();
                } catch (SQLException ex){
                    java.util.logging.Logger.getLogger(DAO_sementara.class.getName()).log(Level.SEVERE,null,ex);
                }
            }
        }
    }

    @Override
    public void ubahData(model_sementara mod) {
        PreparedStatement st = null;
        String sql = "UPDATE sementara SET jumlah = ?, subtotal = ? WHERE kode_barang = ?";
        try{
            st = conn.prepareStatement(sql);
            
            st.setInt(1, mod.getJumlah());
            st.setLong(2, mod.getSubtotal());
            st.setString(3, mod.getKode_barang());
            
            st.executeUpdate();
        } catch (SQLException ex){
            java.util.logging.Logger.getLogger(DAO_sementara.class.getName()).log(Level.SEVERE,null,ex);
        } finally {
            if(st != null){
                try{
                    st.close();
                } catch (SQLException ex){
                    java.util.logging.Logger.getLogger(DAO_sementara.class.getName()).log(Level.SEVERE,null,ex);
                }
            }
        }
    }

    @Override
    public List<model_sementara> ambilData() {
        PreparedStatement st = null;
        List list = new ArrayList();
        ResultSet rs = null;
        String sql = "SELECT * FROM sementara ";
        try{
            st = conn.prepareStatement(sql);
            rs = st.executeQuery();
            while(rs.next()){
                model_sementara mod = new model_sementara();
                
                mod.setKode_barang(rs.getString("kode_barang"));
                mod.setNama_barang(rs.getString("nama_barang"));
                mod.setJumlah(rs.getInt("jumlah"));
                mod.setSubtotal(rs.getLong("subtotal"));
                
                list.add(mod);
            }
            return list;
        } catch (SQLException ex){
            java.util.logging.Logger.getLogger(DAO_sementara.class.getName()).log(Level.SEVERE,null,ex);
            return null;
        } finally {
            if(st != null){
                try{
                    st.close();
                } catch (SQLException ex){
                    java.util.logging.Logger.getLogger(DAO_sementara.class.getName()).log(Level.SEVERE,null,ex);
                }
            }
        }
    }
    
}
