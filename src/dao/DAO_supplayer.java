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
import model.model_supplayer;
import service.service_supplayer;

/**
 *
 * @author fatiq
 */
public class DAO_supplayer implements service_supplayer{

    private Connection conn;
    
    public DAO_supplayer(){
        conn = koneksi.getConnection();
    }
    
    @Override
    public void tambahData(model_supplayer modSup) {
        PreparedStatement st = null;
        String sql = "INSERT INTO supplayer (id_supplayer,nama_supplayer,alamat_supplayer,telpon_supplayer) VALUE (?,?,?,?)";
        try{
            st = conn.prepareStatement(sql);
            
            st.setString(1, modSup.getId_supplayer());
            st.setString(2, modSup.getNama_supplayer());
            st.setString(3, modSup.getAlamat_supplayer());
            st.setString(4, modSup.getTlp_supplayer());
            
            st.executeUpdate();
        } catch (SQLException ex){
            java.util.logging.Logger.getLogger(DAO_supplayer.class.getName()).log(Level.SEVERE,null,ex);
        } finally {
            if(st != null){
                try{
                    st.close();
                } catch (SQLException ex){
                    java.util.logging.Logger.getLogger(DAO_supplayer.class.getName()).log(Level.SEVERE,null,ex);
                }
            }
        }
    }

    @Override
    public void hapusData(model_supplayer modSup) {
        PreparedStatement st = null;
        String sql = "DELETE FROM supplayer WHERE id_supplayer = ?";
        try{
            st = conn.prepareStatement(sql);
            
            st.setString(1, modSup.getId_supplayer());
            
            st.executeUpdate();
        } catch (SQLException ex){
            java.util.logging.Logger.getLogger(DAO_supplayer.class.getName()).log(Level.SEVERE,null,ex);
        } finally {
            if(st != null){
                try{
                    st.close();
                } catch (SQLException ex){
                    java.util.logging.Logger.getLogger(DAO_supplayer.class.getName()).log(Level.SEVERE,null,ex);
                }
            }
        }
    }

    @Override
    public void ubahData(model_supplayer modSup) {
        PreparedStatement st = null;
        String sql = "UPDATE supplayer SET nama_supplayer = ?, alamat_supplayer = ?, telpon_supplayer = ? "
                +"WHERE id_supplayer =  '"+modSup.getId_supplayer()+"'";
        try{
            st = conn.prepareStatement(sql);
            
            st.setString(1, modSup.getNama_supplayer());
            st.setString(2, modSup.getAlamat_supplayer());
            st.setString(3, modSup.getTlp_supplayer());
            
            st.executeUpdate();
        } catch (SQLException ex){
            java.util.logging.Logger.getLogger(DAO_supplayer.class.getName()).log(Level.SEVERE,null,ex);
        } finally {
            if(st != null){
                try{
                    st.close();
                } catch (SQLException ex){
                    java.util.logging.Logger.getLogger(DAO_supplayer.class.getName()).log(Level.SEVERE,null,ex);
                }
            }
        }
    }

    @Override
    public model_supplayer getByID(String id) {
        PreparedStatement st = null;
        ResultSet rs = null;
        model_supplayer mod = new model_supplayer();
        String sql = "SELECT * FROM supplayer WHERE id_supplayer LIKE '"+id+"%' LIMIT 1";
        try{
            st = conn.prepareStatement(sql);
            rs = st.executeQuery();
            while(rs.next()){
                mod.setId_supplayer(rs.getString("id_supplayer"));
                mod.setNama_supplayer(rs.getString("nama_supplayer"));
                mod.setAlamat_supplayer(rs.getString("alamat_supplayer"));
                mod.setTlp_supplayer(rs.getString("telpon_supplayer"));
                
            }
            return mod;
        } catch (SQLException ex){
            java.util.logging.Logger.getLogger(DAO_supplayer.class.getName()).log(Level.SEVERE,null,ex);
            return null;
        } finally {
            if(st != null){
                try{
                    st.close();
                } catch (SQLException ex){
                    java.util.logging.Logger.getLogger(DAO_supplayer.class.getName()).log(Level.SEVERE,null,ex);
                }
            }
        }
    }

    @Override
    public List<model_supplayer> ambilData() {
        PreparedStatement st = null;
        List list = new ArrayList();
        ResultSet rs = null;
        String sql = "SELECT * FROM supplayer ";
        try{
            st = conn.prepareStatement(sql);
            rs = st.executeQuery();
            while(rs.next()){
                model_supplayer mod = new model_supplayer();
                
                mod.setId_supplayer(rs.getString("id_supplayer"));
                mod.setNama_supplayer(rs.getString("nama_supplayer"));
                mod.setAlamat_supplayer(rs.getString("alamat_supplayer"));
                mod.setTlp_supplayer(rs.getString("telpon_supplayer"));
                
                list.add(mod);
            }
            return list;
        } catch (SQLException ex){
            java.util.logging.Logger.getLogger(DAO_supplayer.class.getName()).log(Level.SEVERE,null,ex);
            return null;
        } finally {
            if(st != null){
                try{
                    st.close();
                } catch (SQLException ex){
                    java.util.logging.Logger.getLogger(DAO_supplayer.class.getName()).log(Level.SEVERE,null,ex);
                }
            }
        }
    }

    @Override
    public List<model_supplayer> pencarianData(String id) {
        PreparedStatement st = null;
        List list = new ArrayList();
        ResultSet rs = null;
        String sql = "SELECT * FROM supplayer "
                +"WHERE (id_supplayer LIKE '"+id+"%' OR nama_supplayer LIKE '"+id+"%')";
        try{
            st = conn.prepareStatement(sql);
            rs = st.executeQuery();
            while(rs.next()){
                model_supplayer mod = new model_supplayer();
                
                mod.setId_supplayer(rs.getString("id_supplayer"));
                mod.setNama_supplayer(rs.getString("nama_supplayer"));
                mod.setAlamat_supplayer(rs.getString("alamat_supplayer"));
                mod.setTlp_supplayer(rs.getString("telpon_supplayer"));
                
                list.add(mod);
            }
            return list;
        } catch (SQLException ex){
            java.util.logging.Logger.getLogger(DAO_supplayer.class.getName()).log(Level.SEVERE,null,ex);
            return null;
        } finally {
            if(st != null){
                try{
                    st.close();
                } catch (SQLException ex){
                    java.util.logging.Logger.getLogger(DAO_supplayer.class.getName()).log(Level.SEVERE,null,ex);
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
        SimpleDateFormat nonformat = new SimpleDateFormat("yy");
        String tgl = tanggal.format(now);
        String no = nonformat.format(now);
        
        String sql = "SELECT RIGHT (id_supplayer, 3) AS nomor "
                +"FROM supplayer "
                +"WHERE id_supplayer LIKE 'SP"+no+"%' "
                +"ORDER BY id_supplayer DESC LIMIT 1";
        
        try{
            st = conn.prepareStatement(sql);
            rs = st.executeQuery();
            if(rs.next()){
                int nomor1 = Integer.parseInt(rs.getString("nomor"));
                nomor1++;
                urutan = "SP"+no+String.format("%03d", nomor1);
            } else {
                urutan = "SP"+no+"001";
            }
        } catch (SQLException ex){
            java.util.logging.Logger.getLogger(DAO_supplayer.class.getName()).log(Level.SEVERE,null,ex);
        } finally {
            if(st != null){
                try{
                    st.close();
                } catch (SQLException ex){
                    java.util.logging.Logger.getLogger(DAO_supplayer.class.getName()).log(Level.SEVERE,null,ex);
                }
            }
        }
        return urutan;
    }
}
