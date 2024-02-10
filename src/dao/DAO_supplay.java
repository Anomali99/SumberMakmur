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
import model.model_penjual;
import model.model_supplay;
import model.model_supplayer;
import service.service_supplay;

/**
 *
 * @author fatiq
 */
public class DAO_supplay implements service_supplay{

    private Connection conn;
    
    public DAO_supplay(){
        conn = koneksi.getConnection();
    }

    @Override
    public void tambahData(model_supplay modSup) {
        PreparedStatement st = null;
        String sql = "INSERT INTO supplay (id_penjual,id_supplayer,no_supplay,tanggal,total_supplay) VALUE (?,?,?,?,?)";
        try{
            st = conn.prepareStatement(sql);
            
            st.setString(1, modSup.getId_Pen().getId_penjual());
            st.setString(2, modSup.getId_sup().getId_supplayer());
            st.setString(3, modSup.getNo_supplay());
            st.setString(4, modSup.getTanggal());
            st.setLong(5, modSup.getTotal());
            
            st.executeUpdate();
        } catch (SQLException ex){
            java.util.logging.Logger.getLogger(DAO_supplay.class.getName()).log(Level.SEVERE,null,ex);
        } finally {
            if(st != null){
                try{
                    st.close();
                } catch (SQLException ex){
                    java.util.logging.Logger.getLogger(DAO_supplay.class.getName()).log(Level.SEVERE,null,ex);
                }
            }
        }
    }

    @Override
    public model_supplay getByID(String id) {
        throw new UnsupportedOperationException("Not supported yet."); // Generated from nbfs://nbhost/SystemFileSystem/Templates/Classes/Code/GeneratedMethodBody
    }

    @Override
    public List<model_supplay> ambilData() {
        PreparedStatement st = null;
        List list = new ArrayList();
        ResultSet rs = null;
        String sql = "SELECT * "
                +"FROM supplay ps INNER JOIN penjual pj "
                +"ON ps.id_penjual = pj.id_penjual "
                +"INNER JOIN supplayer pl "
                +"ON ps.id_supplayer = pl.id_supplayer";
        try{
            st = conn.prepareStatement(sql);
            rs = st.executeQuery();
            while(rs.next()){
                model_supplay pes = new model_supplay();
                model_penjual pen = new model_penjual();
                model_supplayer sup = new model_supplayer();
                
                pes.setNo_supplay(rs.getString("no_supplay"));
                pes.setTanggal(rs.getString("tanggal"));
                pes.setTotal(rs.getLong("total_supplay"));
                pen.setId_penjual(rs.getString("id_penjual"));
                pen.setNama_penjual(rs.getString("nama_penjual"));
                sup.setId_supplayer(rs.getString("id_supplayer"));
                sup.setNama_supplayer(rs.getString("nama_supplayer"));
                
                pes.setId_Pen(pen);
                pes.setId_sup(sup);
                
                list.add(pes);
            }
            return list;
        } catch (SQLException ex){
            java.util.logging.Logger.getLogger(DAO_supplay.class.getName()).log(Level.SEVERE,null,ex);
            return null;
        } finally {
            if(st != null){
                try{
                    st.close();
                } catch (SQLException ex){
                    java.util.logging.Logger.getLogger(DAO_supplay.class.getName()).log(Level.SEVERE,null,ex);
                }
            }
        }
    }

    @Override
    public List<model_supplay> pencarianData(String id) {
        PreparedStatement st = null;
        List list = new ArrayList();
        ResultSet rs = null;
        String sql = "SELECT * "
                +"FROM supplay ps INNER JOIN penjual pj "
                +"ON ps.id_penjual = pj.id_penjual "
                +"INNER JOIN supplayer pl "
                +"ON ps.id_supplayer = pl.id_supplayer "
                +"WHERE ps.no_supplay = '"+id+"' ";
        try{
            st = conn.prepareStatement(sql);
            rs = st.executeQuery();
            while(rs.next()){
                model_supplay pes = new model_supplay();
                model_penjual pen = new model_penjual();
                model_supplayer sup = new model_supplayer();
                
                pes.setNo_supplay(rs.getString("no_supplay"));
                pes.setTanggal(rs.getString("tanggal"));
                pes.setTotal(rs.getLong("total_supplay"));
                pen.setId_penjual(rs.getString("id_penjual"));
                pen.setNama_penjual(rs.getString("nama_penjual"));
                sup.setId_supplayer(rs.getString("id_supplayer"));
                sup.setNama_supplayer(rs.getString("nama_supplayer"));
                
                pes.setId_Pen(pen);
                pes.setId_sup(sup);
                
                list.add(pes);
            }
            return list;
        } catch (SQLException ex){
            java.util.logging.Logger.getLogger(DAO_supplay.class.getName()).log(Level.SEVERE,null,ex);
            return null;
        } finally {
            if(st != null){
                try{
                    st.close();
                } catch (SQLException ex){
                    java.util.logging.Logger.getLogger(DAO_supplay.class.getName()).log(Level.SEVERE,null,ex);
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
        
        String sql = "SELECT RIGHT (no_supplay, 3) AS nomor "
                +"FROM supplay "
                +"WHERE no_supplay LIKE 'SY"+no+"%' "
                +"ORDER BY no_supplay DESC LIMIT 1";
        
        try{
            st = conn.prepareStatement(sql);
            rs = st.executeQuery();
            if(rs.next()){
                int nomor1 = Integer.parseInt(rs.getString("nomor"));
                nomor1++;
                urutan = "SY"+no+String.format("%03d", nomor1);
            } else {
                urutan = "SY"+no+"001";
            }
        } catch (SQLException ex){
            java.util.logging.Logger.getLogger(DAO_supplay.class.getName()).log(Level.SEVERE,null,ex);
        } finally {
            if(st != null){
                try{
                    st.close();
                } catch (SQLException ex){
                    java.util.logging.Logger.getLogger(DAO_supplay.class.getName()).log(Level.SEVERE,null,ex);
                }
            }
        }
        return urutan;
    }
    
}
