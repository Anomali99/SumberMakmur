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
import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Date;
import java.util.List;
import java.util.logging.Level;
import model.model_barang;
import service.service_barang;

/**
 *
 * @author fatiq
 */
public class DAO_barang implements service_barang{
    
    private Connection conn;
    
    public DAO_barang(){
        conn = koneksi.getConnection();
    }

    @Override
    public void tambahData(model_barang modBar) {
        PreparedStatement st = null;
        String sql = "INSERT INTO barang (kode_barang, nama_barang, harga, stok) VALUE (?,?,?,?)";
        try{
            st = conn.prepareStatement(sql);
            
            st.setString(1, modBar.getKode_barang());
            st.setString(2, modBar.getNama_barang());
            st.setLong(3, modBar.getHarga());
            st.setInt(4, modBar.getStok());
              
            st.executeUpdate();
        } catch (SQLException ex){
            java.util.logging.Logger.getLogger(DAO_barang.class.getName()).log(Level.SEVERE,null,ex);
        } finally {
            if(st != null){
                try{
                    st.close();
                } catch (SQLException ex){
                    java.util.logging.Logger.getLogger(DAO_barang.class.getName()).log(Level.SEVERE,null,ex);
                }
            }
        }
    }

    @Override
    public void hapusData(model_barang modBar) {
        PreparedStatement st = null;
        String sql = "DELETE FROM barang WHERE kode_barang = ?";
        try{
            st = conn.prepareStatement(sql);
            
            st.setString(1, modBar.getKode_barang());
            
            st.executeUpdate();
        } catch (SQLException ex){
            java.util.logging.Logger.getLogger(DAO_barang.class.getName()).log(Level.SEVERE,null,ex);
        } finally {
            if(st != null){
                try{
                    st.close();
                } catch (SQLException ex){
                    java.util.logging.Logger.getLogger(DAO_barang.class.getName()).log(Level.SEVERE,null,ex);
                }
            }
        }
    }

    @Override
    public void ubahData(model_barang modBar) {
        PreparedStatement st = null;
        String sql = "UPDATE barang SET nama_barang = ?, harga =?, stok = ? "
                +"WHERE kode_barang = '"+modBar.getKode_barang()+"'";
        try{
            st = conn.prepareStatement(sql);
            
            st.setString(1, modBar.getNama_barang());
            st.setLong(2, modBar.getHarga());
            st.setInt(3, modBar.getStok());
            
            st.executeUpdate();
        } catch (SQLException ex){
            java.util.logging.Logger.getLogger(DAO_barang.class.getName()).log(Level.SEVERE,null,ex);
        } finally {
            if(st != null){
                try{
                    st.close();
                } catch (SQLException ex){
                    java.util.logging.Logger.getLogger(DAO_barang.class.getName()).log(Level.SEVERE,null,ex);
                }
            }
        }
    }

    @Override
    public model_barang getByID(String id) {
        PreparedStatement st = null;
        ResultSet rs = null;
        model_barang mod = new model_barang();
        String sql = "SELECT * FROM barang WHERE kode_barang LIKE '"+id+"%' LIMIT 1";
        try{
            st = conn.prepareStatement(sql);
            rs = st.executeQuery();
            
            while(rs.next()){
                mod.setKode_barang(rs.getString("kode_barang"));
                mod.setNama_barang(rs.getString("nama_barang"));
                mod.setHarga(rs.getLong("harga"));
                mod.setStok(rs.getInt("stok"));
            }
            
            return mod;
        } catch (SQLException ex){
            java.util.logging.Logger.getLogger(DAO_barang.class.getName()).log(Level.SEVERE,null,ex);
            return null;
        } finally {
            if(st != null){
                try{
                    st.close();
                } catch (SQLException ex){
                    java.util.logging.Logger.getLogger(DAO_barang.class.getName()).log(Level.SEVERE,null,ex);
                }
            }
        }
    }

    @Override
    public List<model_barang> ambilData() {
        PreparedStatement st = null;
        List list = new ArrayList();
        ResultSet rs = null;
        String sql = "SELECT * FROM barang ";
        try{
            st = conn.prepareStatement(sql);
            rs = st.executeQuery();
            while(rs.next()){
                model_barang mod = new model_barang();
                
                mod.setKode_barang(rs.getString("kode_barang"));
                mod.setNama_barang(rs.getString("nama_barang"));
                mod.setHarga(rs.getLong("harga"));
                mod.setStok(rs.getInt("stok"));
                
                list.add(mod);
            }
            return list;
        } catch (SQLException ex){
            java.util.logging.Logger.getLogger(DAO_barang.class.getName()).log(Level.SEVERE,null,ex);
            return null;
        } finally {
            if(st != null){
                try{
                    st.close();
                } catch (SQLException ex){
                    java.util.logging.Logger.getLogger(DAO_barang.class.getName()).log(Level.SEVERE,null,ex);
                }
            }
        }
    }

    @Override
    public List<model_barang> pencarianData(String id) {
        PreparedStatement st = null;
        List list = new ArrayList();
        ResultSet rs = null;
        String sql = "SELECT * FROM barang "
                +"WHERE (kode_barang LIKE '"+id+"%' OR nama_barang LIKE '"+id+"%')";
        try{
            st = conn.prepareStatement(sql);
            rs = st.executeQuery();
            while(rs.next()){
                model_barang mod = new model_barang();
                
                mod.setKode_barang(rs.getString("kode_barang"));
                mod.setNama_barang(rs.getString("nama_barang"));
                mod.setHarga(rs.getLong("harga"));
                mod.setStok(rs.getInt("stok"));
                
                list.add(mod);
            }
            return list;
        } catch (SQLException ex){
            java.util.logging.Logger.getLogger(DAO_barang.class.getName()).log(Level.SEVERE,null,ex);
            return null;
        } finally {
            if(st != null){
                try{
                    st.close();
                } catch (SQLException ex){
                    java.util.logging.Logger.getLogger(DAO_barang.class.getName()).log(Level.SEVERE,null,ex);
                }
            }
        }
    }

    @Override
    public String nomor() {
        PreparedStatement st = null;
        ResultSet rs = null;
        String urutan = null;
        
        Date now = new Date();
        SimpleDateFormat tanggal = new SimpleDateFormat("yyyy-MM-dd");
        SimpleDateFormat nonformat = new SimpleDateFormat("yyMMdd");
        String tgl = tanggal.format(now);
        String no = nonformat.format(now);
        
        String sql = "SELECT RIGHT (kode_barang, 3) AS nomor "
                +"FROM barang "
                +"WHERE kode_barang LIKE 'B"+no+"%' "
                +"ORDER BY kode_barang DESC LIMIT 1";
        
        try{
            st = conn.prepareStatement(sql);
            rs = st.executeQuery();
            if(rs.next()){
                int nomor1 = Integer.parseInt(rs.getString("nomor"));
                nomor1++;
                urutan = "B"+no+String.format("%03d", nomor1);
            } else {
                urutan = "B"+no+"001";
            }
        } catch (SQLException ex){
            java.util.logging.Logger.getLogger(DAO_barang.class.getName()).log(Level.SEVERE,null,ex);
        } finally {
            if(st != null){
                try{
                    st.close();
                } catch (SQLException ex){
                    java.util.logging.Logger.getLogger(DAO_barang.class.getName()).log(Level.SEVERE,null,ex);
                }
            }
        }
        return urutan;
    }

    @Override
    public int ambilStok(String id) {
        PreparedStatement st = null;
        ResultSet rs = null;
        int sisa = 0;
        String sql = "SELECT * FROM barang WHERE kode_barang LIKE '"+id+"%' LIMIT 1";
        try{
            st = conn.prepareStatement(sql);
            rs = st.executeQuery();
            
            while(rs.next()){
                sisa = rs.getInt("stok");
            }
            
            return sisa;
        } catch (SQLException ex){
            java.util.logging.Logger.getLogger(DAO_barang.class.getName()).log(Level.SEVERE,null,ex);
            return 0;
        } finally {
            if(st != null){
                try{
                    st.close();
                } catch (SQLException ex){
                    java.util.logging.Logger.getLogger(DAO_barang.class.getName()).log(Level.SEVERE,null,ex);
                }
            }
        }
    }

    @Override
    public void ubahStok(int stok, String id) {
        PreparedStatement st = null;
        String sql = "UPDATE barang SET stok = ? "
                +"WHERE kode_barang = '"+id+"'";
        try{
            st = conn.prepareStatement(sql);
            
            st.setInt(1, stok);
            
            st.executeUpdate();
        } catch (SQLException ex){
            java.util.logging.Logger.getLogger(DAO_barang.class.getName()).log(Level.SEVERE,null,ex);
        } finally {
            if(st != null){
                try{
                    st.close();
                } catch (SQLException ex){
                    java.util.logging.Logger.getLogger(DAO_barang.class.getName()).log(Level.SEVERE,null,ex);
                }
            }
        }
    }
}
