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
import model.model_pelanggan;
import service.service_pelanggan;

/**
 *
 * @author fatiq
 */
public class DAO_pelanggan implements service_pelanggan{

    private Connection conn;
    
    public DAO_pelanggan(){
        conn = koneksi.getConnection();
    }

    @Override
    public void tambahData(model_pelanggan modPel) {
        PreparedStatement st = null;
        String sql = "INSERT INTO pelanggan (id_pelanggan,nama_pelanggan,alamat_pelanggan,telpon_pelanggan) VALUE (?,?,?,?)";
        try{
            st = conn.prepareStatement(sql);
            
            st.setString(1, modPel.getId_pelanggan());
            st.setString(2, modPel.getNama_pelanggan());
            st.setString(3, modPel.getAlamat_pelanggan());
            st.setString(4, modPel.getTlp_pelanggan());
            
            st.executeUpdate();
        } catch (SQLException ex){
            java.util.logging.Logger.getLogger(DAO_pelanggan.class.getName()).log(Level.SEVERE,null,ex);
        } finally {
            if(st != null){
                try{
                    st.close();
                } catch (SQLException ex){
                    java.util.logging.Logger.getLogger(DAO_pelanggan.class.getName()).log(Level.SEVERE,null,ex);
                }
            }
        }
    }

    @Override
    public void hapusData(model_pelanggan modPel) {
        PreparedStatement st = null;
        String sql = "DELETE FROM pelanggan WHERE id_pelanggan = ?";
        try{
            st = conn.prepareStatement(sql);
            
            st.setString(1, modPel.getId_pelanggan());
            
            st.executeUpdate();
        } catch (SQLException ex){
            java.util.logging.Logger.getLogger(DAO_pelanggan.class.getName()).log(Level.SEVERE,null,ex);
        } finally {
            if(st != null){
                try{
                    st.close();
                } catch (SQLException ex){
                    java.util.logging.Logger.getLogger(DAO_pelanggan.class.getName()).log(Level.SEVERE,null,ex);
                }
            }
        }
    }

    @Override
    public void ubahData(model_pelanggan modPel) {
        PreparedStatement st = null;
        String sql = "UPDATE pelanggan SET nama_pelanggan = ?, alamat_pelanggan = ?, telpon_pelanggan = ? "
                +"WHERE id_pelanggan = '"+modPel.getId_pelanggan()+"'";
        try{
            st = conn.prepareStatement(sql);
            
            st.setString(1, modPel.getNama_pelanggan());
            st.setString(2, modPel.getAlamat_pelanggan());
            st.setString(3, modPel.getTlp_pelanggan());
            
            st.executeUpdate();
        } catch (SQLException ex){
            java.util.logging.Logger.getLogger(DAO_pelanggan.class.getName()).log(Level.SEVERE,null,ex);
        } finally {
            if(st != null){
                try{
                    st.close();
                } catch (SQLException ex){
                    java.util.logging.Logger.getLogger(DAO_pelanggan.class.getName()).log(Level.SEVERE,null,ex);
                }
            }
        }
    }

    @Override
    public model_pelanggan getByID(String id) {
        PreparedStatement st = null;
        ResultSet rs = null;
        String sql = "SELECT * FROM pelanggan  "
                +"WHERE id_pelanggan LIKE '"+id+"%' LIMIT 1";
        try{
            st = conn.prepareStatement(sql);
            rs = st.executeQuery();
            model_pelanggan mod = new model_pelanggan();
            
            while(rs.next()){
                mod.setId_pelanggan(rs.getString("id_pelanggan"));
                mod.setNama_pelanggan(rs.getString("nama_pelanggan"));
                mod.setAlamat_pelanggan(rs.getString("alamat_pelanggan"));
                mod.setTlp_pelanggan(rs.getString("telpon_pelanggan"));
            }
            return mod;
        } catch (SQLException ex){
            java.util.logging.Logger.getLogger(DAO_pelanggan.class.getName()).log(Level.SEVERE,null,ex);
            return null;
        } finally {
            if(st != null){
                try{
                    st.close();
                } catch (SQLException ex){
                    java.util.logging.Logger.getLogger(DAO_pelanggan.class.getName()).log(Level.SEVERE,null,ex);
                }
            }
        }
    }

    @Override
    public List<model_pelanggan> ambilData() {
        PreparedStatement st = null;
        List list = new ArrayList();
        ResultSet rs = null;
        String sql = "SELECT * FROM pelanggan ";
        try{
            st = conn.prepareStatement(sql);
            rs = st.executeQuery();
            while(rs.next()){
                model_pelanggan mod = new model_pelanggan();
                
                mod.setId_pelanggan(rs.getString("id_pelanggan"));
                mod.setNama_pelanggan(rs.getString("nama_pelanggan"));
                mod.setAlamat_pelanggan(rs.getString("alamat_pelanggan"));
                mod.setTlp_pelanggan(rs.getString("telpon_pelanggan"));
                
                list.add(mod);
            }
            return list;
        } catch (SQLException ex){
            java.util.logging.Logger.getLogger(DAO_pelanggan.class.getName()).log(Level.SEVERE,null,ex);
            return null;
        } finally {
            if(st != null){
                try{
                    st.close();
                } catch (SQLException ex){
                    java.util.logging.Logger.getLogger(DAO_pelanggan.class.getName()).log(Level.SEVERE,null,ex);
                }
            }
        }
    }

    @Override
    public List<model_pelanggan> pencarianData(String id) {
        PreparedStatement st = null;
        List list = new ArrayList();
        ResultSet rs = null;
        String sql = "SELECT * FROM pelanggan "
                +"WHERE (id_pelanggan LIKE '"+id+"%' OR nama_pelanggan LIKE '"+id+"%')";
        try{
            st = conn.prepareStatement(sql);
            rs = st.executeQuery();
            while(rs.next()){
                model_pelanggan mod = new model_pelanggan();
                
                mod.setId_pelanggan(rs.getString("id_pelanggan"));
                mod.setNama_pelanggan(rs.getString("nama_pelanggan"));
                mod.setAlamat_pelanggan(rs.getString("alamat_pelanggan"));
                mod.setTlp_pelanggan(rs.getString("telpon_pelanggan"));
                
                list.add(mod);
            }
            return list;
        } catch (SQLException ex){
            java.util.logging.Logger.getLogger(DAO_pelanggan.class.getName()).log(Level.SEVERE,null,ex);
            return null;
        } finally {
            if(st != null){
                try{
                    st.close();
                } catch (SQLException ex){
                    java.util.logging.Logger.getLogger(DAO_pelanggan.class.getName()).log(Level.SEVERE,null,ex);
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
        
        String sql = "SELECT RIGHT (id_pelanggan, 3) AS nomor "
                +"FROM pelanggan "
                +"WHERE id_pelanggan LIKE 'PL"+no+"%' "
                +"ORDER BY id_pelanggan DESC LIMIT 1";
        
        try{
            st = conn.prepareStatement(sql);
            rs = st.executeQuery();
            if(rs.next()){
                int nomor1 = Integer.parseInt(rs.getString("nomor"));
                nomor1++;
                urutan = "PL"+no+String.format("%03d", nomor1);
            } else {
                urutan = "PL"+no+"001";
            }
        } catch (SQLException ex){
            java.util.logging.Logger.getLogger(DAO_pelanggan.class.getName()).log(Level.SEVERE,null,ex);
        } finally {
            if(st != null){
                try{
                    st.close();
                } catch (SQLException ex){
                    java.util.logging.Logger.getLogger(DAO_pelanggan.class.getName()).log(Level.SEVERE,null,ex);
                }
            }
        }
        return urutan;
    }
    
}
