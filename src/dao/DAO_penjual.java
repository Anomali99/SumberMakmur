/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package dao;

import config.koneksi;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Date;
import java.util.List;
import java.util.logging.Level;
import java.util.logging.Logger;
import model.model_penjual;
import service.service_penjual;

/**
 *
 * @author fatiq
 */
public class DAO_penjual implements service_penjual{

    private Connection conn;
    
    public DAO_penjual(){
        conn = koneksi.getConnection();
    }

    @Override
    public void tambahData(model_penjual modPen) {
        PreparedStatement st = null;
        String sql = "INSERT INTO penjual (id_penjual, username, password, nama_penjual, telpon_penjual, alamat_penjual, level) VALUE (?,?,?,?,?,?,?)";
        try{
            st = conn.prepareStatement(sql);
            
            st.setString(1, modPen.getId_penjual());
            st.setString(2, modPen.getUsername());
            st.setString(3, Encrypt.getmd5java(modPen.getPassword()));
            st.setString(4, modPen.getNama_penjual());
            st.setString(5, modPen.getTlp_penjual());
            st.setString(6, modPen.getAlamat_penjual());
            st.setString(7, modPen.getLevel());
            
            st.executeUpdate();
        } catch (SQLException ex){
            java.util.logging.Logger.getLogger(DAO_penjual.class.getName()).log(Level.SEVERE,null,ex);
        } finally {
            if(st != null){
                try{
                    st.close();
                } catch (SQLException ex){
                    java.util.logging.Logger.getLogger(DAO_penjual.class.getName()).log(Level.SEVERE,null,ex);
                }
            }
        }
    }

    @Override
    public void hapusData(model_penjual modPen) {
        PreparedStatement st = null;
        String sql = "DELETE FROM penjual WHERE id_penjual = ?";
        try{
            st = conn.prepareStatement(sql);
            st.setString(1, modPen.getId_penjual());
            st.executeUpdate();
        } catch (SQLException ex){
            java.util.logging.Logger.getLogger(DAO_penjual.class.getName()).log(Level.SEVERE,null,ex);
        } finally {
            if(st != null){
                try{
                    st.close();
                } catch (SQLException ex){
                    java.util.logging.Logger.getLogger(DAO_penjual.class.getName()).log(Level.SEVERE,null,ex);
                }
            }
        }
    }

    @Override
    public void ubahDataA(model_penjual modPen) {
        PreparedStatement st = null;
        String sql = "UPDATE penjual SET level = ? WHERE id_penjual = ?";
        try{
            st = conn.prepareStatement(sql);
            
            st.setString(1, modPen.getLevel());
            st.setString(2, modPen.getId_penjual());
            
            st.executeUpdate();
        } catch (SQLException ex){
            java.util.logging.Logger.getLogger(DAO_penjual.class.getName()).log(Level.SEVERE,null,ex);
         } finally {
            if(st != null){
                try{
                    st.close();
                } catch (SQLException ex){
                    java.util.logging.Logger.getLogger(DAO_penjual.class.getName()).log(Level.SEVERE,null,ex);
                }
            }
        }
    }

    @Override
    public void ubahData(model_penjual modPen) {
        PreparedStatement st = null;
        String sql = "UPDATE penjual SET username = ?, nama_penjual = ?, telpon_penjual = ?, alamat_penjual = ?, level = ? WHERE id_penjual = ?";
        try{
            st = conn.prepareStatement(sql);
            
            st.setString(1, modPen.getUsername());
            st.setString(2, modPen.getNama_penjual());
            st.setString(3, modPen.getTlp_penjual());
            st.setString(4, modPen.getAlamat_penjual());
            st.setString(5, modPen.getLevel());
            st.setString(6, modPen.getId_penjual());
            
            st.executeUpdate();
        } catch (SQLException ex){
            java.util.logging.Logger.getLogger(DAO_penjual.class.getName()).log(Level.SEVERE,null,ex);
        } finally {
            if(st != null){
                try{
                    st.close();
                } catch (SQLException ex){
                    java.util.logging.Logger.getLogger(DAO_penjual.class.getName()).log(Level.SEVERE,null,ex);
                }
            }
        }
    }

    @Override
    public void ubahPassword(model_penjual modPen) {
        PreparedStatement st = null;
        String sql = "UPDATE penjual SET password = ? WHERE id_penjual = ?";
        try{
            st = conn.prepareStatement(sql);
            
            st.setString(1, Encrypt.getmd5java(modPen.getPassword()));
            st.setString(2, modPen.getId_penjual());
            
            st.executeUpdate();
        } catch (SQLException ex){
            java.util.logging.Logger.getLogger(DAO_penjual.class.getName()).log(Level.SEVERE,null,ex);
        } finally {
            if(st != null){
                try{
                    st.close();
                } catch (SQLException ex){
                    java.util.logging.Logger.getLogger(DAO_penjual.class.getName()).log(Level.SEVERE,null,ex);
                }
            }
        }
    }

    @Override
    public void ubahFoto(model_penjual modPen) {
        PreparedStatement st = null;
        String sql = "UPDATE penjual SET foto = ? WHERE id_penjual = ?";
        try{
            st = conn.prepareStatement(sql);
            
            String imgPath = modPen.getImgPath();
            if(imgPath != null){
                File imgFile = new File(imgPath);
                FileInputStream fis = new FileInputStream(imgFile);
                byte[] imgData = new byte[(int) imgFile.length()];
                fis.read(imgData);
                fis.close();
                st.setBytes(1, imgData);
            } else {
                st.setNull(1, java.sql.Types.BLOB);
            }
            st.setString(2, modPen.getId_penjual());
            
            st.executeUpdate();
        } catch (SQLException ex){
            java.util.logging.Logger.getLogger(DAO_penjual.class.getName()).log(Level.SEVERE,null,ex);
        } catch (FileNotFoundException ex) {
            Logger.getLogger(DAO_penjual.class.getName()).log(Level.SEVERE, null, ex);
        } catch (IOException ex) {
            Logger.getLogger(DAO_penjual.class.getName()).log(Level.SEVERE, null, ex);
        } finally {
            if(st != null){
                try{
                    st.close();
                } catch (SQLException ex){
                    java.util.logging.Logger.getLogger(DAO_penjual.class.getName()).log(Level.SEVERE,null,ex);
                }
            }
        }
    }

    @Override
    public model_penjual getByID(String id) {
        PreparedStatement st = null;
        model_penjual mod = new model_penjual();
        ResultSet rs = null;
        String sql = "SELECT * FROM penjual WHERE id_penjual LIKE '"+id+"%' LIMIT 1";
        try{
            st = conn.prepareStatement(sql);
            rs = st.executeQuery();
            while(rs.next()){
                
                mod.setId_penjual(rs.getString("id_penjual"));
                mod.setUsername(rs.getString("username"));
                mod.setNama_penjual(rs.getString("nama_penjual"));
                mod.setPassword(rs.getString("password"));
                mod.setAlamat_penjual(rs.getString("alamat_penjual"));
                mod.setTlp_penjual(rs.getString("telpon_penjual"));
                mod.setLevel(rs.getString("level"));
                mod.setGambar(rs.getBlob("foto"));
                
            }
            return mod;
        } catch (SQLException ex){
            java.util.logging.Logger.getLogger(DAO_penjual.class.getName()).log(Level.SEVERE,null,ex);
            return null;
        } finally {
            if(st != null){
                try{
                    st.close();
                } catch (SQLException ex){
                    java.util.logging.Logger.getLogger(DAO_penjual.class.getName()).log(Level.SEVERE,null,ex);
                }
            }
        }
    }

    @Override
    public List<model_penjual> ambilData() {
        PreparedStatement st = null;
        List list = new ArrayList();
        ResultSet rs = null;
        String sql = "SELECT * FROM penjual";
        try{
            st = conn.prepareStatement(sql);
            rs = st.executeQuery();
            while(rs.next()){
                model_penjual mod = new model_penjual();
                
                mod.setId_penjual(rs.getString("id_penjual"));
                mod.setUsername(rs.getString("username"));
                mod.setNama_penjual(rs.getString("nama_penjual"));
                mod.setPassword(rs.getString("password"));
                mod.setAlamat_penjual(rs.getString("alamat_penjual"));
                mod.setTlp_penjual(rs.getString("telpon_penjual"));
                mod.setLevel(rs.getString("level"));
                mod.setGambar(rs.getBlob("foto"));
                
                list.add(mod);
            }
            return list;
        } catch (SQLException ex){
            java.util.logging.Logger.getLogger(DAO_penjual.class.getName()).log(Level.SEVERE,null,ex);
            return null;
        } finally {
            if(st != null){
                try{
                    st.close();
                } catch (SQLException ex){
                    java.util.logging.Logger.getLogger(DAO_penjual.class.getName()).log(Level.SEVERE,null,ex);
                }
            }
        }
    }

    @Override
    public List<model_penjual> pencarianData(String id) {
        PreparedStatement st = null;
        List list = new ArrayList();
        ResultSet rs = null;
        String sql = "SELECT * FROM penjual "
                +"WHERE (id_penjual LIKE '"+id+"%' OR username LIKE '"+id+"%' OR nama_penjual LIKE '"+id+"%')";
        try{
            st = conn.prepareStatement(sql);
            rs = st.executeQuery();
            while(rs.next()){
                model_penjual mod = new model_penjual();
                
                mod.setId_penjual(rs.getString("id_penjual"));
                mod.setUsername(rs.getString("username"));
                mod.setNama_penjual(rs.getString("nama_penjual"));
                mod.setPassword(rs.getString("password"));
                mod.setAlamat_penjual(rs.getString("alamat_penjual"));
                mod.setTlp_penjual(rs.getString("telpon_penjual"));
                mod.setLevel(rs.getString("level"));
                mod.setGambar(rs.getBlob("foto"));
                
                list.add(mod);
            }
            return list;
        } catch (SQLException ex){
            java.util.logging.Logger.getLogger(DAO_penjual.class.getName()).log(Level.SEVERE,null,ex);
            return null;
        } finally {
            if(st != null){
                try{
                    st.close();
                } catch (SQLException ex){
                    java.util.logging.Logger.getLogger(DAO_penjual.class.getName()).log(Level.SEVERE,null,ex);
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
        
        String sql = "SELECT RIGHT (id_penjual, 3) AS nomor "
                +"FROM penjual "
                +"WHERE id_penjual LIKE 'PJ"+no+"%' "
                +"ORDER BY id_penjual DESC LIMIT 1";
        
        try{
            st = conn.prepareStatement(sql);
            rs = st.executeQuery();
            if(rs.next()){
                int nomor1 = Integer.parseInt(rs.getString("nomor"));
                nomor1++;
                urutan = "PJ"+no+String.format("%03d", nomor1);
            } else {
                urutan = "PJ"+no+"001";
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
