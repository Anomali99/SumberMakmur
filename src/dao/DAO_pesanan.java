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
import model.model_penjual;
import model.model_pesanan;
import service.service_pesanan;

/**
 *
 * @author fatiq
 */
public class DAO_pesanan implements service_pesanan{

    private Connection conn;
    
    public DAO_pesanan(){
        conn = koneksi.getConnection();
    }

    @Override
    public void tambahData(model_pesanan modPes) {
        PreparedStatement st = null;
        String sql = "INSERT INTO pemesanan (id_penjual,id_pelanggan,no_pesanan,tanggal,total_pesanan) VALUE (?,?,?,?,?)";
        try{
            st = conn.prepareStatement(sql);
            
            st.setString(1, modPes.getId_Pen().getId_penjual());
            st.setString(2, modPes.getId_pel().getId_pelanggan());
            st.setString(3, modPes.getNo_pesan());
            st.setString(4, modPes.getTanggal());
            st.setLong(5, modPes.getTotal());
            
            st.executeUpdate();
        } catch (SQLException ex){
            java.util.logging.Logger.getLogger(DAO_detailPesanan.class.getName()).log(Level.SEVERE,null,ex);
        } finally {
            if(st != null){
                try{
                    st.close();
                } catch (SQLException ex){
                    java.util.logging.Logger.getLogger(DAO_detailPesanan.class.getName()).log(Level.SEVERE,null,ex);
                }
            }
        }
    }

    @Override
    public model_pesanan getByID(String id) {
        throw new UnsupportedOperationException("Not supported yet."); // Generated from nbfs://nbhost/SystemFileSystem/Templates/Classes/Code/GeneratedMethodBody
    }

    @Override
    public List<model_pesanan> ambilData() {
        PreparedStatement st = null;
        List list = new ArrayList();
        ResultSet rs = null;
        String sql = "SELECT * "
                +"FROM pemesanan ps INNER JOIN penjual pj "
                +"ON ps.id_penjual = pj.id_penjual "
                +"INNER JOIN pelanggan pl "
                +"ON ps.id_pelanggan = pl.id_pelanggan ORDER BY ps.no_pesanan";
        try{
            st = conn.prepareStatement(sql);
            rs = st.executeQuery();
            while(rs.next()){
                model_pesanan pes = new model_pesanan();
                model_penjual pen = new model_penjual();
                model_pelanggan pel = new model_pelanggan();
                
                pes.setNo_pesan(rs.getString("no_pesanan"));
                pes.setTanggal(rs.getString("tanggal"));
                pes.setTotal(rs.getLong("total_pesanan"));
                pen.setId_penjual(rs.getString("id_penjual"));
                pen.setNama_penjual(rs.getString("nama_penjual"));
                pel.setId_pelanggan(rs.getString("id_pelanggan"));
                pel.setNama_pelanggan(rs.getString("nama_pelanggan"));
                
                pes.setId_Pen(pen);
                pes.setId_pel(pel);
                
                list.add(pes);
            }
            return list;
        } catch (SQLException ex){
            java.util.logging.Logger.getLogger(DAO_pesanan.class.getName()).log(Level.SEVERE,null,ex);
            return null;
        } finally {
            if(st != null){
                try{
                    st.close();
                } catch (SQLException ex){
                    java.util.logging.Logger.getLogger(DAO_pesanan.class.getName()).log(Level.SEVERE,null,ex);
                }
            }
        }
    }

    @Override
    public List<model_pesanan> pencarianData(String id) {
        PreparedStatement st = null;
        List list = new ArrayList();
        ResultSet rs = null;
        String sql = "SELECT * "
                +"FROM pemesanan ps INNER JOIN penjual pj "
                +"ON ps.id_penjual = pj.id_penjual "
                +"INNER JOIN pelanggan pl "
                +"ON ps.id_pelanggan = pl.id_pelanggan "
                +"WHERE ps.no_pesanan LIKE '"+id+"%' ORDER BY ps.no_pesanan";
        try{
            st = conn.prepareStatement(sql);
            rs = st.executeQuery();
            while(rs.next()){
                model_pesanan pes = new model_pesanan();
                model_penjual pen = new model_penjual();
                model_pelanggan pel = new model_pelanggan();
                
                pes.setNo_pesan(rs.getString("no_pesanan"));
                pes.setTanggal(rs.getString("tanggal"));
                pes.setTotal(rs.getLong("total_pesanan"));
                pen.setId_penjual(rs.getString("id_penjual"));
                pen.setNama_penjual(rs.getString("nama_penjual"));
                pel.setId_pelanggan(rs.getString("id_pelanggan"));
                pel.setNama_pelanggan(rs.getString("nama_pelanggan"));
                
                pes.setId_Pen(pen);
                pes.setId_pel(pel);
                
                list.add(pes);
            }
            return list;
        } catch (SQLException ex){
            java.util.logging.Logger.getLogger(DAO_pesanan.class.getName()).log(Level.SEVERE,null,ex);
            return null;
        } finally {
            if(st != null){
                try{
                    st.close();
                } catch (SQLException ex){
                    java.util.logging.Logger.getLogger(DAO_pesanan.class.getName()).log(Level.SEVERE,null,ex);
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
        
        String sql = "SELECT RIGHT (no_pesanan, 3) AS nomor "
                +"FROM pemesanan "
                +"WHERE no_pesanan LIKE 'PS"+no+"%' "
                +"ORDER BY no_pesanan DESC LIMIT 1";
        
        try{
            st = conn.prepareStatement(sql);
            rs = st.executeQuery();
            if(rs.next()){
                int nomor1 = Integer.parseInt(rs.getString("nomor"));
                nomor1++;
                urutan = "PS"+no+String.format("%03d", nomor1);
            } else {
                urutan = "PS"+no+"001";
            }
        } catch (SQLException ex){
            java.util.logging.Logger.getLogger(DAO_pesanan.class.getName()).log(Level.SEVERE,null,ex);
        } finally {
            if(st != null){
                try{
                    st.close();
                } catch (SQLException ex){
                    java.util.logging.Logger.getLogger(DAO_pesanan.class.getName()).log(Level.SEVERE,null,ex);
                }
            }
        }
        return urutan;
    }
    
}
